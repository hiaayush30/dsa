package linear_ds.array;

// prefix array stores sum of ith elements
// sum of a sub array = prefix[end] - prefix[start-1]
// O(n^2) time complexity

public class MaxSubArrayPrefixSum {
    public static void findMaxSubArrays(int[] arr){
        int max = Integer.MIN_VALUE;

        // calculate the prefix array
        int[] prefix  = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
                prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                if(i==0){
                    currSum = prefix[j];
                }else {
                    currSum = prefix[j] - prefix[i-1];
                }
                if(currSum>max){ max = currSum; }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] arr = {1,-3,6,2};
        findMaxSubArrays(arr);
    }
}
