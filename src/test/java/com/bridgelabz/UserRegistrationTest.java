package com.bridgelabz;
import com.bridgelabz.UserRegistration;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.testng.Assert;

import java.util.Scanner;

public class UserRegistrationTest {
    @Test
    void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validFirstName("Naval");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validFirstName("Na");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenFirstName_WhenWithNumberOrSpecialCharacters_ShouldReturnFalse() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validFirstName("N@val");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validateLastName("Balingal");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    void givenLastName_WhenShort_ShouldReturnFalse() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validateLastName("Ba");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenLastName_WhenWithNumberOrSpecialCharacters_ShouldReturnFalse() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validateLastName("B@alingal");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenLastName_WhenStartingWithSmallLetter_ShouldReturnFalse() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validateLastName("balingal");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenValid_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validateEmailAddress("kumarb@gmail.com");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    void givenEmail_WhenUserNameIsMissing_ShouldReturnFalse() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validateEmailAddress("@gmail.com");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenDomainNameIsMissing_ShouldReturnFalse() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validateEmailAddress("kumarb@.com");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenMainTldIsMissing_ShouldReturnFalse() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validateEmailAddress("kumarb@gmail");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenAtTheRateIsMissing_ShouldReturnFalse() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validateEmailAddress("kumarbgmail.com");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenWithOptionalTld_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validateEmailAddress("kumarb@gmail.co.in");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validateMobileNumber("91 8055055582");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    void givenMobileNumber_WhenNoCountryCode_ShouldReturnFalse() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validateMobileNumber("8055055582");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenMobileNumber_WhenSpaceIsMissingAfterCountryCode_ShouldReturnFalse() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validateMobileNumber("918055055582");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenMobileNumber_WhenShort_ShouldReturnFalse() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validateMobileNumber("91 80550");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenPassword_WhenValid_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validatePassword("Naval@2201");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    void givenPassword_WhenShort_ShouldReturnFalse() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validatePassword("Naval12");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenPassword_WhenWithAtLeastOneUpperCase_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validatePassword("naval@2201");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    void givenPassword_WhenWithAtLeastOneNumericNumber_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validatePassword("Naval&b95");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    void givenPassword_WhenWithAtLeastOneSpecialCharacters_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = false;
        try {
            result = validator.validatePassword("Naval2201");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstName_WhenNull_ShouldThrow_UserRegistrationException() {
        UserRegistration validator = new UserRegistration();
        try {
            validator.validFirstName(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    void givenFirstName_WhenEmpty_ShouldThrow_UserRegistrationException() {
        UserRegistration validator = new UserRegistration();
        try {
            validator.validFirstName("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    void givenLastName_WhenNull_ShouldThrow_UserRegistrationException() {
        UserRegistration validator = new UserRegistration();
        try {
            validator.validateLastName(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    void givenLastName_WhenEmpty_ShouldThrow_UserRegistrationException() {
        UserRegistration validator = new UserRegistration();
        try {
            validator.validateLastName("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    void givenEmailAddress_WhenNull_ShouldThrow_UserRegistrationException() {
        UserRegistration validator = new UserRegistration();
        try {
            validator.validateEmailAddress(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    void givenEmailAddress_WhenEmpty_ShouldThrow_UserRegistrationException() {
        UserRegistration validator = new UserRegistration();
        try {
            validator.validateEmailAddress("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    void givenMobileNumber_WhenNull_ShouldThrow_UserRegistrationException() {
        UserRegistration validator = new UserRegistration();
        try {
            validator.validateMobileNumber(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    void givenMobileNumber_WhenEmpty_ShouldThrow_UserRegistrationException() {
        UserRegistration validator = new UserRegistration();
        try {
            validator.validateMobileNumber("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    void givenPassword_WhenNull_ShouldThrow_UserRegistrationException() {
        UserRegistration validator = new UserRegistration();
        try {
            validator.validatePassword(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    void givenPassword_WhenEmpty_ShouldThrow_UserRegistrationException() {
        UserRegistration validator = new UserRegistration();
        try {
            validator.validatePassword("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
}
