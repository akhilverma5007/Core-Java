public class Code_LinearSearch {
    public static void main(String[] args){
        //Search in the array: return the index if item found
        //otherwise if item not found return -1
        int[] nums = {2,4,1,44,222,19};
        int target = 44;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at evry index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

    }
}
