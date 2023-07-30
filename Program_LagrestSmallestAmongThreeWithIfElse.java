//Define two methods to print the maximum and the minimum number
//respectively among three numbers entered by the user.

import java.util.Scanner;

public class Program_LagrestSmallestAmongThreeWithIfElse {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Three numbers to find the maximum and minimum : ");
        System.out.print("Enter Number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = in.nextInt();
        System.out.print("Enter Number 3: ");
        int num3 = in.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("Hence:- Number 1 i.e, " + num1 + " is Greatest among all");
        }
        if(num2 > num1 && num2 > num3){
            System.out.println("Hence:- Number 2 i.e, " + num2 + " is Greatest among all");
        }
        if(num3 > num1 && num3 > num2){
            System.out.println("Hence:- Number 3 i.e, " + num3 + " is Greatest among all");
        }
        if(num1 < num2 && num1 < num3){
            System.out.println("Hence:- Number 1 i.e, " + num1 + " is Smallest among all");
        }
        if(num2 < num1 && num2 < num3){
            System.out.println("Hence:- Number 2 i.e, " + num2 + " is Smallest among all");
        }
        if(num3 < num1 && num3 < num2){
            System.out.println("Hence:- Number 3 i.e, " + num3 + " is Smallest among all");
        }
        if(num1 == num2 && num1 != num3 && num2 != num3){
            System.out.println("Hence Number 1 i.e, " + num1 + " and Number 2 i.e, " + num2 + " both are Equal");
        }
        if(num2 == num3 && num1 != num3 && num1 != num2){
            System.out.println("Hence Number 2 i.e, " + num2 + " and Number 3 i.e, " + num3 + " both are Equal");
        }
        if(num1 == num3 && num2 != num1 && num2 != num3){
            System.out.println("Hence Number 1 i.e, " + num1 + " and Number 3 i.e, " + num3 + " both are Equal");
        }
        if(num1 == num3 && num1 == num2 && num2 == num3){
            System.out.println("Hence Number 1 i.e, " + num1 + ", Number 2 i.e, " + num2 + " and Number 3 i.e, " + num3 + " both are Equal");
        }

    }
}
