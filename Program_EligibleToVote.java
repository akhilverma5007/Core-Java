//A person is eligible to vote if his/her age is greater than or equal to 18. 
//Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class Program_EligibleToVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = in.nextInt();
        if(age <= 18){
            System.out.println("You're Eligible to vote. Thanks.");
        }else{
            System.out.println("Sorry You're not Eligible for voting.");
        }

    }
}
