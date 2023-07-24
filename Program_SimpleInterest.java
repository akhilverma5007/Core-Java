//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;

public class Program_SimpleInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("To calculate SI, Enter Principal: ");
        int principal = input.nextInt();
        System.out.print("Time: ");
        int time = input.nextInt();
        System.out.print("Rate: ");
        int rate = input.nextInt();

        int si = (principal * time * rate) / 100;
        System.out.println("Your S.I for: where Principal = " + principal + ", Time = " + time + ", Rate = " + rate + " is :- " + si);
    }
}
