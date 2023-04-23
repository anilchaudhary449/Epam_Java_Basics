package com.epam.rd.autotasks;


import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.SpoonAPI;
import spoon.reflect.declaration.CtField;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodeComplianceTest {

    @Test
    void testFields() {
        final SpoonAPI spoon = new Launcher();
        spoon.addInputResource("src/main/java/");
        spoon.buildModel();

        Set<String> allFields = spoon.getModel().getElements(new TypeFilter<>(CtField.class)).stream()
                .map(Objects::toString)
                .collect(Collectors.toSet());

        assertEquals(
                Set.of("private final long ships;", "private long shots = 0L;"),
                allFields);
    }
}
