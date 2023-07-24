import java.util.Scanner;
public class Program_SalaryBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input Your Salary: ");
        int salary = input.nextInt();

        if(salary > 10000){
            // salary = salary + 2000;
            salary += 2000;
        }
        else{
            salary += 1000;
        }
        System.out.println("Your salary after adding bonus is : " + salary);
    }
}
