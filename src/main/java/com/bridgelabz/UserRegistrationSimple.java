package com.bridgelabz;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationSimple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your First Name : ");
        String firstName= sc.nextLine();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}",firstName));

        System.out.println("Enter your Last Name : ");
        String lastName= sc.nextLine();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}",lastName));

        System.out.println("Enter your Email ID : ");
        String email= sc.nextLine();
        System.out.println(Pattern.matches("^([a][b][c])([\\.][a-z]+)?[@][b][l][\\.][c][o]([\\.][i][n])?",email));

        System.out.println("Enter your Mobile Number : ");
        String mobileNumber= sc.nextLine();
        System.out.println(Pattern.matches("(91\\s)?[789][0-9]{9}$",mobileNumber));

        System.out.println("Enter your Password : ");
        String password= sc.nextLine();
        System.out.println(Pattern.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$",password));

        String[] validEmail={"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com",
                "abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"};
        String[] invalidEmail={"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com",
                               "abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com",
                               "abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"};

        for (String value : validEmail) {
            System.out.println(value);
            System.out.println(Pattern.matches("^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", value));
        }
        for (String s : invalidEmail) {
            System.out.println(s);
            System.out.println(Pattern.matches("^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", s));
        }
    }

}
