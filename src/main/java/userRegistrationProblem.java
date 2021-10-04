import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistrationProblem {
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
        System.out.println(Pattern.matches("[a-zA-Z0-9_\\-.]+[@][a-z]+[\\.][a-z]{2,3}",email));

        System.out.println("Enter your Mobile Number : ");
        String mobileNumber= sc.nextLine();
        System.out.println(Pattern.matches("(91\\s)?[789][0-9]{9}$",mobileNumber));

        System.out.println("Enter your Password : ");
        String password= sc.nextLine();
        System.out.println(Pattern.matches("[a-zA-Z]{8,}",password));
    }
}
