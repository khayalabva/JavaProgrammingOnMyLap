package day10_NestedIf;

public class AgeGroups {
    public static void main(String[] args) {

        /*
        Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

         */

        int age =27;
        String group= (age>=0 && age <= 100)? (age <21)? "Teenager":(age<55)? "Adult": "Senior": "Invalid age";
        System.out.println(group);






    }
}
