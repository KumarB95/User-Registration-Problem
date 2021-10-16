package com.bridgelabz;
import java.util.regex.Pattern;

public class UserRegistration {
    // Constants
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_ADDRESS_PATTERN = "^[0-9A-Za-z]+(([._+-]?)[0-9A-Za-z]+)*@[0-9A-Za-z]+.[a-z]{2,4}.([a-z]{2,3})*$";
    private static final String MOBILE_NUMBER = "^[91]{2}[\\s][0-9]{10}$";
    private static final String PASSWORD = "^[a-z(?=.*A-Z)(?=.*0-9)(?=.*@#$%^&+=)]{8,}$";

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Validation Problem");
    }

    public boolean validFirstName(String fname) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }

    public boolean validateLastName(String lname) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lname).matches();
    }

    public boolean validateEmailAddress(String mail) {
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
        return pattern.matcher(mail).matches();
    }

    public boolean validateMobileNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER);
        return pattern.matcher(phoneNumber).matches();
    }

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD);
        return pattern.matcher(password).matches();
    }
}
