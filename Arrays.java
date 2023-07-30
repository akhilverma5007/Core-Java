import java.util.Scanner;
// import java.util.Arrays;

public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[4];
        // System.out.println(arr[0]);

        // String[] str = new String[7];
        // System.out.println(str[3]);

        // str[0] = "Akhil";
        // str[3] = "Verma";

        // System.out.println(str[3]);


        // int[] ab = {1,2,34,223};
        // System.out.println(ab); 


        //for loop
        // int numValue[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        //    for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        for (int each : arr){
            System.out.print(each + " ");
        }

        //INSTED OF USING THESE ABOVE LOOP

        //System.out.println(Arrays.toString(arr));

    }
}
