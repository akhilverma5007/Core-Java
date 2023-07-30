//Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class Program_EvenOddCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to check whether its even or odd: ");
        int num = in.nextInt();

        if(num % 2 == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is odd");
        }
    }    
}
