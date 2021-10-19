package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Purpose : To create Lambda Expression for validating user details by
 * using Functional Interface
 */
public class UserRegistrationLambdaExpression {
    static Scanner scr = new Scanner(System.in);

    // This method is created for implementing Lambda Expression
    public void validateUserDetails(){
        // To validate first name
        ValidationFunction firstName = () -> {

            System.out.println("Enter your first name : ");
            String fName = scr.next();

            Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
            Matcher matcher = pattern.matcher(fName);
            if (matcher.matches()) {
                System.out.println(fName + " is valid");
            } else
                System.out.println(fName + " is invalid");
        };
        firstName.validate();

        // To validate last name
        ValidationFunction lastName = () -> {

            System.out.println("Enter your last name : ");
            String lName = scr.next();

            Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
            Matcher matcher = pattern.matcher(lName);
            if (matcher.matches()) {
                System.out.println(lName + " is valid");
            } else
                System.out.println(lName + " is invalid");
        };
        lastName.validate();

        // To validate E-Mail
        ValidationFunction mail = () -> {

            System.out.println("Enter your E-Mail Id : ");
            String eMail = scr.next();

            Pattern pattern = Pattern.compile("^[0-9A-Za-z]+(([._+-]?)[0-9A-Za-z]+)*@[0-9A-Za-z]+.[a-z]{2,4}.([a-z]{2,3})*$");
            Matcher matcher = pattern.matcher(eMail);
            if (matcher.matches()) {
                System.out.println(eMail + " is valid");
            } else
                System.out.println(eMail + " is invalid");
        };
        mail.validate();

        // To validate phone number
        ValidationFunction phoneNumber = () -> {

            scr.nextLine();
            System.out.println("Enter your mobile number : ");
            String pNumber = scr.nextLine();

            Pattern pattern = Pattern.compile("^[91]{2}[\\s][0-9]{10}$");
            Matcher matcher = pattern.matcher(pNumber);
            if (matcher.matches()) {
                System.out.println(pNumber + " is valid");
            } else
                System.out.println(pNumber + " is invalid");
        };
        phoneNumber.validate();

        // To validate password
        ValidationFunction Password = () -> {

            System.out.println("Enter your password : ");
            String password = scr.next();

            Pattern pattern = Pattern.compile("^[a-z(?=.*A-Z)(?=.*0-9)(?=.*@#$%^&+=)]{8,}$");
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                System.out.println(password + " is valid");
            } else
                System.out.println(password + " is invalid");
        };
        Password.validate();
    }
}

