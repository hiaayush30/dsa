package linear_ds.array;

public class MaxSubArraySumKadanes {

    // adding a large negative value to a small positive value is not favourable
    // O(n) time complexity
    public static void findMaxSubArrays(int[] arr){
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if(currSum > max) max = currSum;
            if (currSum < 0) currSum = 0;
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        findMaxSubArrays(arr);
    }
}
