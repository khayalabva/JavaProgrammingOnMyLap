package day14_String;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
// kayala_bva@gmail.com
        System.out.println("Enter your email:");
        String email = scan.next();

        String fname = email.substring(0,email.indexOf("_"));
        String lname = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String rest = email.substring(email.indexOf("@"));

        System.out.println(lname+"_"+fname+rest);

scan.close();

    }
}
/*
7. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com

 */
