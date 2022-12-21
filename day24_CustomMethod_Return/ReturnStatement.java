package day24_CustomMethod_Return;

public class ReturnStatement {
    public static void main(String[] args) {
        nameOfDay(2);
        nameOfDay(9);
    }




    public static void nameOfDay(int number){
        if(number < 1 || number> 7){
            System.out.println("Invalid");
            return;              //exits nameOfday method
        }
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
        }
    }
}
