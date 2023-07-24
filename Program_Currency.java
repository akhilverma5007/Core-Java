//Input currency in rupees and output in USD.  82

import java.util.Scanner;
public class Program_Currency {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount in Rupee.");
        float amount = input.nextFloat();
        float usd_currency = amount * 0.012f;
        System.out.println("USD value of: " + amount + " is " + usd_currency);
    }
}
