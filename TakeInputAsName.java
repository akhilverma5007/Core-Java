//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;
public class TakeInputAsName {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       String name = input.next();
        System.out.println("Hi! Good Morning " + name);
    }
}
