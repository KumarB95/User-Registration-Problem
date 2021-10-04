import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistrationProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name : ");
        String name= sc.nextLine();
        Pattern pattern=Pattern.compile("[A-Z]{1}[a-z]{3,20}$");
        Matcher matcher=pattern.matcher(name);
        System.out.println(matcher.find());

    }
}
