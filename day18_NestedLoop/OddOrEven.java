package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
while(true) {
    System.out.println("Enter a number:");
    int num = scan.nextInt();

    if (num % 2 == 0) {
        System.out.println("Even number");
    } else {
        System.out.println("Odd  number");
    }

    System.out.println("Would you like to add another number?");
    String a = scan.next();

    if (!(a.equals("yes") || a.equals("no"))){
        System.out.println("Invalid answer, please re enter:");
        a = scan.next();
    }
    if(a.equals("no")){
        break;
    }


}
scan.close();
    }
}
