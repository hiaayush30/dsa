package linear_ds.array;

public class SubArray {
    // a continuous part of array is a sub array => n(n+1)/2
    public static void findSubArrays(int[] arr){
        // O(n^3) time complexity
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {  // print all elements between i and j
                    System.out.print(arr[k] + ",");
                }
                total ++;
                System.out.println();
            }
        }
        System.out.println("Total subarrays = "+ total);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,6,2};  // sub arrays = [1],[1,3],[1,3,6],[1,3,6,2] etc
        findSubArrays(arr);
    }
}
