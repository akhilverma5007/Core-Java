import java.util.Scanner;

public class SwitchStatements{
    public static void main(String[] args) {
        String a = "fruit";
        String b = "fruit";
        System.out.println(a.equals(b));

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a fruit");
        String fruit = input.next();

        switch(fruit){

            case "apple":
            System.out.println("Its an Apple");
            break;

            case "orange":
            System.out.println("Its an orange");
            break;

            default:
            System.out.println("Invalid Input");
        }

        //New Enhanced Switch

        System.out.println("Enter Your Name");
        String name = input.next();
        switch(name){
            case "Akhil" -> System.out.println("My name is Akhil");
            case "Sohil" -> System.out.println("My name is sohil");
            default -> System.out.println("Invalid inputtt");
        }

        System.out.println("Enter day Example -: 1/2/3");
        int day = input.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        //Benefits of not using break statements
        System.out.println("Enter the day to know whether is s weekday or weekend :- Example Monday");
        String week = input.next();
        switch(week){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Its a weekday");
            case "Saturday", "Sunday" -> System.out.println("Its a weekend");
            default -> System.out.println("Invalid Input");
        }
    }
}