import java.util.Scanner;
import java.util.Arrays;

public class MultiDiemensionArrays {
    public static void main(String[] args) {
        //int[][] arr = new int[3][];

        Scanner input = new Scanner(System.in);
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] arr2D = {
            {1, 2, 3}, //0th index
            {4, 5}, //1st index
            {6, 7, 8, 9} //2nd index 
        };
        
        int[][] arrNew = new int[3][2];
        System.out.println(arr.length); //no of rows

        //input
        for (int row = 0; row < arrNew.length; row++) {
         //System.out.println(row);   
            //for each column in every row
            for (int col = 0; col < arrNew[row].length; col++) {
                arrNew[row][col] = input.nextInt();
            }
        }
    
        //output
         for (int row = 0; row < arrNew.length; row++) {
            //for each column in every row
            for (int col = 0; col < arrNew[row].length; col++) {
                System.out.print(arrNew[row][col] + " ");
            }
            System.out.println();
        }

        //Another way to output
        for (int row = 0; row < arrNew.length; row++) {
           System.out.println(Arrays.toString(arr[row]));
        }

        //Enhanced for loop for output
        for(int[] a :arrNew){
            System.out.println(Arrays.toString(a));
        }
    }
}
