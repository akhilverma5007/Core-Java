//Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class Program_LargestNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("To check which is greater: Type Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = input.nextInt();
        
        if(num1 < num2){
            System.out.println(num2 + " i.e, num2 is Greater.");
        }
        else if(num2 < num1){
            System.out.println(num1 + " i.e, num1 is Greater.");
        }
        else if(num1 == num2){
            System.out.println(num1 + " and " + num2 + " is Equal.");
        }
    }    
}
