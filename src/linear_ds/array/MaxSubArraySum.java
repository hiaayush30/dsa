package linear_ds.array;

public class MaxSubArraySum {
    public static void findMaxSubArrays(int[] arr){
        // O(n^3) time complexity
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {  // print all elements between i and j
                    System.out.print(arr[k] + ",");
                    currSum += arr[k];
                }
                if(currSum>max){
                    max = currSum;
                }
                System.out.println();
            }
        }
        System.out.println("Max sub array sum:"+ max);

    }

    public static void main(String[] args) {
        int[] arr = {1,-3,6,2};  // sub arrays = [1],[1,3],[1,3,6],[1,3,6,2] etc
        findMaxSubArrays(arr);
    }
}
