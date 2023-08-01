import java.util.Arrays;

public class Array_PassingInFunctions {
    public static void main(String[] args){

        int[] nums = {1,23,4,56,31}; 

        System.out.println(Arrays.toString(nums));
        change(nums);  //---function calling
        System.out.println(Arrays.toString(nums)); //--- this is mutable behaviour in Arrays

    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}
