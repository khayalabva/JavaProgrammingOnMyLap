package day12_Scanner;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double r = scan.nextDouble();


        double area = r * 3.14;
        double perimeter = 2*r*3.14;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


        scan.close();
    }
}
