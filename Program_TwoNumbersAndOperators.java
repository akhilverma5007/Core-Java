//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;
public class Program_TwoNumbersAndOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = input.nextInt();        
        System.out.print("Enter Number 2: ");
        int num2 = input.nextInt();
        System.out.print("Enetr Operation to perform: Add/Sub/Mul/Div - ");
        String enter_operator = input.next();
        int addd = num1 + num2;
        int subt = num1 - num2;
        int mull = num1 * num2;
        int divv = num1 / num2;

        if(enter_operator.equals("Add")){
            System.out.println("Addition of " + num1 + " + " + num2 + " is " + addd);
        }
        else if(enter_operator.equals("Sub")){
            System.out.println("Substraction of " + num1 + " - " + num2 + " is " + subt);
        }
        else if(enter_operator.equals("Mul")){
            System.out.println("Multiplication of " + num1 + " * " + num2 + " is " + mull);
        }
        else if(enter_operator.equals("Div")){
            System.out.println("Division of " + num1 + " / " + num2 + " is " + divv);
        }
        else{
            System.out.println("Invalid Input, Please Try Again.");
        }
    }
}
