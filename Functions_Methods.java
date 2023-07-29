import java.util.Scanner;

public class Functions_Methods {
    public static void main(String[] args){
        sum();
        int result = sum2(10,29);
        System.out.println(result);


    }
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = input.next();
        System.out.println("Hello " + name);
    }



    static int sum2(int a, int b){
        int sum = a + b;
        return sum;
    }
}
