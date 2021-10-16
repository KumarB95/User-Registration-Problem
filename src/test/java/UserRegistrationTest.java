import com.bridgelabz.UserRegistration;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
//import org.testng.Assert;

import java.util.Scanner;

public class UserRegistrationTest {
    //Scanner sc=new Scanner(System.in);
    @Test
    public void whenFirstNameEnteredFirstCharMustBeCapsAndAtLeast3Char(){
        UserRegistration validator =new UserRegistration();
        boolean result=validator.validFirstName("Navalkumar");
        Assert.assertTrue(result);
    }
    @Test
    void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserRegistration validator =new UserRegistration();
        boolean result = validator.validFirstName("Na");
        Assert.assertTrue(result);
    }

    @Test
    void givenFirstName_WhenWithNumberOrSpecialCharacters_ShouldReturnFalse() {
        UserRegistration validator =new UserRegistration();
        boolean result = validator.validFirstName("Nav&al");
        Assert.assertTrue(result);
    }

    @Test
    void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration validator =new UserRegistration();
        boolean result = validator.validateLastName("Balingal");
        Assert.assertTrue(result);
    }

    @Test
    void givenLastName_WhenShort_ShouldReturnFalse() {
        UserRegistration validator =new UserRegistration();
        boolean result = validator.validateLastName("Ba");
        Assert.assertTrue(result);
    }

    @Test
    void givenLastName_WhenWithNumberOrSpecialCharacters_ShouldReturnFalse() {
        UserRegistration validator =new UserRegistration();
        boolean result = validator.validateLastName("Bal%ingal");
        Assert.assertTrue(result);
    }

    @Test
    void givenLastName_WhenStartingWithSmallLetter_ShouldReturnFalse() {
        UserRegistration validator =new UserRegistration();
        boolean result = validator.validateLastName("balingal");
        Assert.assertTrue(result);
    }

    @Test
    void givenEmail_WhenValid_ShouldReturnTrue() {
        UserRegistration validator =new UserRegistration();
        boolean result = validator.validateEmailAddress("kumarbalingal@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    void givenEmail_WhenUserNameIsMissing_ShouldReturnFalse() {
        UserRegistration validator =new UserRegistration();
        boolean result = validator.validateEmailAddress("@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    void givenEmail_WhenDomainNameIsMissing_ShouldReturnFalse() {
        UserRegistration validator =new UserRegistration();
        boolean result = validator.validateEmailAddress("kumarb370@.com");
        Assert.assertTrue(result);
    }

    @Test
    void givenEmail_WhenMainTldIsMissing_ShouldReturnFalse() {
        UserRegistration validator =new UserRegistration();
        boolean result = validator.validateEmailAddress("kumarbalingal@gmail");
        Assert.assertTrue(result);
    }

    @Test
    void givenEmail_WhenAtTheRateIsMissing_ShouldReturnFalse() {
        UserRegistration validator =new UserRegistration();
        boolean result = validator.validateEmailAddress("kumarbgmail.com");
        Assert.assertTrue(result);
    }

    @Test
    void givenEmail_WhenWithOptionalTld_ShouldReturnTrue() {
        UserRegistration validator =new UserRegistration();
        boolean result = validator.validateEmailAddress("kumarb@gmail.co.in");
        Assert.assertTrue(result);
    }

    @Test
    void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        UserRegistration validator =new UserRegistration();
        boolean result = validator.validateMobileNumber("91 8055055582");
        Assert.assertTrue(result);
    }

    @Test
    void givenMobileNumber_WhenNoCountryCode_ShouldReturnFalse() {
        UserRegistration validator =new UserRegistration();
        boolean result = validator.validateMobileNumber("8055055582");
        Assert.assertTrue(result);
    }

    @Test
    void givenMobileNumber_WhenSpaceIsMissingAfterCountryCode_ShouldReturnFalse() {
        UserRegistration validator =new UserRegistration();
        boolean result = validator.validateMobileNumber("918055055582");
        Assert.assertTrue(result);
    }

    @Test
    void givenMobileNumber_WhenShort_ShouldReturnFalse() {
        UserRegistration validator =new UserRegistration();
        boolean result = validator.validateMobileNumber("91 805505");
        Assert.assertTrue(result);
    }

    @Test
    void givenPassword_WhenValid_ShouldReturnTrue() {
        UserRegistration validator =new UserRegistration();
        boolean result = validator.validatePassword("Navalkuamr@2201");
        Assert.assertTrue(result);
    }

    @Test
    void givenPassword_WhenShort_ShouldReturnFalse() {
        UserRegistration validator =new UserRegistration();
        boolean result = validator.validatePassword("Naval12");
        Assert.assertTrue(result);
    }

    @Test
    void givenPassword_WhenWithAtLeastOneUpperCase_ShouldReturnTrue() {
        UserRegistration validator =new UserRegistration();
        boolean result = validator.validatePassword("naval@2201");
        Assert.assertTrue(result);
    }

    @Test
    void givenPassword_WhenWithAtLeastOneNumericNumber_ShouldReturnTrue() {
        UserRegistration validator =new UserRegistration();
        boolean result = validator.validatePassword("Naval&balingal");
        Assert.assertTrue(result);
    }

    @Test
    void givenPassword_WhenWithAtLeastOneSpecialCharacters_ShouldReturnTrue() {
        UserRegistration validator =new UserRegistration();
        boolean result = validator.validatePassword("Naval2021");
        Assert.assertTrue(result);
    }
}

