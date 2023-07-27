import java.util.Scanner;

public class Program_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Take input from user till user does not press X or x
        int ans = 0;
        while (true){
            // take the operator as input
            System.out.println("Enter the operator");
            char op = input.next().trim().charAt(0);
            System.out.println();
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if(num2 != 0){
                    ans = num1 / num2;
                }
            }
            if(op == '%'){
                    ans = num1 % num2;
                }
                
            }
            else if(op == 'x' || op == 'X'){
                break;
            }else{
                System.out.println("Invalid Operation");
            }
                System.out.println(ans);

        }
    }
}
