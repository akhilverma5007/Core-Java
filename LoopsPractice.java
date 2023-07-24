import java.util.Scanner;
public class LoopsPractice {
    public static void main(String[] args){
        //Print numbers 1 to 5
        // for(int i = 1; i <= 5; i+=2){
        for(int i = 1; i <= 5; i++){
        System.out.println(i);
        }
 
        //Print numbers 1 to n
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = input.nextInt();
        for(int j = 1; j <= n; j++){
            System.out.print(j + " ");
        }

        //While Loop
        int num = input.nextInt();
        int k = 1;
        while(k <= num){
            System.out.println(k);
            k++;
        }

        //Do While Loop
        int b = 1;
        System.out.println("Enter value of b ");
        int numb = input.nextInt();
        do{
            System.out.println(b);
            b++;  
        }while(b <= numb);
    }
}
