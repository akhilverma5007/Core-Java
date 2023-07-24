// Take name as input and print a greeting message for that particular name.
import java.util.Scanner;
public class Program_NameAsInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String enter_name = input.next();
        System.out.println("Hi " + enter_name + " hope you doing good! Have a great day ahead!");
    }
}
