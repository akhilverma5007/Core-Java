import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Type Your Case Eg- 1/2/3");
        int empId = in.nextInt();
        System.out.println("Type your department :- IT/ Non IT");
        String department = in.next();

        switch(empId){
            case 1:
            System.out.println("Akhil Verma");
            break;
            case 2:
            System.out.println("Sohil");
            break;
            case 3:
            switch(department){
                case "IT": 
                System.out.println("IT department");
                break;
                case "Non IT":
                System.out.println("Non IT department");
                break;
                default:
                System.out.println("No department found");
            }
            break;
            default:
            System.out.println("Invalid Name");
        }

    }
}
