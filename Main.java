import java.util.Scanner;
public class Main{
    // Starting with capital letter means its a class [Convension]
    // public class means that this class can be accessed from anywhere
    public static void main(String[] args){
        // main function
        // System.out.println(args[1]);
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);
        int abc = input.nextInt();
        System.out.println(abc);
        int num = 'A';
        System.out.println(num);

        int temp = 10;
        if (temp == 10){
            System.out.println("True");
        }else{
            System.out.println("Not equal");
        }

        int count = 1;
        while(count != 5){
            System.out.println(count);
            count++;
        }
        System.out.println("");


        for (int count1 = 1; count1 != 5; count1++){
            System.out.println(count1);
        }
    }
}