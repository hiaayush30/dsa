package linear_ds.array;

public class Pairs {
   // o(n^2) time complexity
   // num of pairs = n(n-1)/2
    public static void findPairs(int[] nums){
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                total ++;
                System.out.println("("+nums[i]+","+nums[j]+")");
            }
        }
        System.out.println("Total pairs: "+total);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        findPairs(arr);
    }
}
