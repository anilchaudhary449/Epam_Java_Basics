package com.epam.rd.contactbook;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.SpoonAPI;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.AbstractFilter;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.BaseStream;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CodeComplianceTest {

    private static CtPackage spoonRootPackage;

    @BeforeAll
    static void init() {
        final SpoonAPI spoon = new Launcher();
        spoon.addInputResource("src/main/java/");
        spoon.buildModel();
        spoonRootPackage = spoon.getFactory().Package().getRootPackage();
    }

    @Test
    void testNoCollections() {

        CtTypeReference baseCollectionRefType = new Launcher().getFactory().Code().createCtTypeReference(Collection.class);
        CtTypeReference baseMapRefType = new Launcher().getFactory().Code().createCtTypeReference(Map.class);

        final List<CtInvocation> methodCallsReturningCollections = spoonRootPackage.getElements(
                new AbstractFilter<>() {
                    @Override
                    public boolean matches(final CtInvocation invocation) {
                        return invocation.getType().isSubtypeOf(baseCollectionRefType)
                                || invocation.getType().isSubtypeOf(baseMapRefType);
                    }
                }
        );
        assertEquals(0, methodCallsReturningCollections.size(),
                () -> "You must not use collections in this exercise, " +
                        "but you have supplied " + methodCallsReturningCollections.size() + " of them: "
                        + methodCallsReturningCollections);

        final List<CtVariable> collectionsVariable = spoonRootPackage.getElements(
                new AbstractFilter<>() {
                    @Override
                    public boolean matches(final CtVariable var) {
                        return var.getType().isSubtypeOf(baseCollectionRefType)
                                || var.getType().isSubtypeOf(baseMapRefType);
                    }
                }
        );

        assertEquals(0, collectionsVariable.size(),
                () -> "You must not use collections in this exercise, " +
                        "but you have supplied " + collectionsVariable.size() + " of them: "
                        + collectionsVariable);

    }

    @Test
    void testNoStreams() {

        CtTypeReference baseStreamRefType = new Launcher().getFactory().Code().createCtTypeReference(BaseStream.class);

        final List<CtInvocation> methodCallsReturningStreams = spoonRootPackage.getElements(
                new AbstractFilter<>() {
                    @Override
                    public boolean matches(final CtInvocation invocation) {
                        return invocation.getType().isSubtypeOf(baseStreamRefType);
                    }
                }
        );
        assertEquals(0, methodCallsReturningStreams.size(),
                () -> "You must not use streams in this exercises, " +
                        "but you have supplied " + methodCallsReturningStreams.size() + " of them: "
                        + methodCallsReturningStreams);
    }

    @Test
    void testClasses() {

        Map<String, CtClass> nonAnonClasses = spoonRootPackage.getElements(new AbstractFilter<CtClass>() {
            @Override
            public boolean matches(final CtClass aClass) {
                return !aClass.isAnonymous() && !aClass.isInterface();
            }
        }).stream().collect(Collectors.toMap(
                CtClass::getQualifiedName,
                c -> c
        ));

        assertEquals(4, nonAnonClasses.size(),
                "You must not add any more non-anonymous classes besides Email, Social and NameContactInfo.");

        CtClass contactClass = nonAnonClasses.get("com.epam.rd.contactbook.Contact");
        CtClass socialClass = nonAnonClasses.get("com.epam.rd.contactbook.Contact$Social");
        CtClass emailClass = nonAnonClasses.get("com.epam.rd.contactbook.Contact$Email");
        CtClass nameContactInfoClass = nonAnonClasses.get("com.epam.rd.contactbook.Contact$NameContactInfo");


        assertNotNull(contactClass);
        assertNotNull(socialClass, "You must add a nested class Social");
        assertNotNull(emailClass, "You must add add a nested class Email");
        assertNotNull(nameContactInfoClass, "You must add add a nested class NameContactInfo");

        CtTypeReference contactInfoTypeRef = new Launcher().getFactory().Code()
                .createCtTypeReference(ContactInfo.class);


        assertTrue(socialClass.isSubtypeOf(contactInfoTypeRef),
                "Social class must implement ContactInfo interface");
        assertTrue(socialClass.isPublic(), "Social class must be public");
        assertTrue(socialClass.isStatic(), "Social class must be static");

        assertTrue(emailClass.isSubtypeOf(contactInfoTypeRef),
                "Email class must implement ContactInfo interface");
        assertTrue(emailClass.isPublic(), "Email class must be public");
        assertTrue(emailClass.isStatic(), "Email class must be static");

        assertTrue(nameContactInfoClass.isSubtypeOf(contactInfoTypeRef),
                "NameContactInfo class must implement ContactInfo interface");
        assertTrue(nameContactInfoClass.isPrivate(), "NameContactInfo class must be private");
        assertFalse(nameContactInfoClass.isStatic(), "NameContactInfo class must NOT be static");

        assertEquals(0, nameContactInfoClass.getAllFields().size(),
                "NameContactInfo must not contain any own fields");
    }
}
