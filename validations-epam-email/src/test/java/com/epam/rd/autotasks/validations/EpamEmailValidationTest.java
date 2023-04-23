package com.epam.rd.autotasks.validations;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static com.epam.rd.autotasks.validations.EpamEmailValidation.validateEpamEmail;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EpamEmailValidationTest {

    @ParameterizedTest(name = "{index} \"{0}\" is not a valid EPAM email")
    @NullAndEmptySource
    @ValueSource(strings = {
            " ",
            "william@epam.com",
            "william.shakespeare@epam.com",
            "william...shakespeare@epam.com",
            "william-shakespeare@epam.com",
            "shakespeare123@epam.com",
            "william_$hakespeare@epam.com",
            "william_shakespeare@epam.org",
            "_shakespeare@epam.com",
            "shakespeare_@epam.com",
            "william.shakespeare@epam@com",
            "william.shakespeare@epamcom",
    })
    void validateEpamEmailInvalidCases(String input) {
        assertFalse(validateEpamEmail(input));
    }

    @ParameterizedTest(name = "{index} \"{0}\" is not a valid EPAM email")
    @ValueSource(strings = {
            "william_shakespeare@epam.com",
            "lu_e@epam.com",
            "william_shakespeare1@epam.com",
            "william_shakespeare2@epam.com"
    })
    void validateEpamEmailValidCases(String input) {
        assertTrue(validateEpamEmail(input));
    }
}