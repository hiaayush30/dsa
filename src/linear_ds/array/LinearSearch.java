package linear_ds.array;

public class LinearSearch {

    // O(n) time complexity
    // O(1) space complexity

    public static int linearSearch (int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key) {
                System.out.println("target found at index " + i);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
        }

        for(int i:arr){
            System.out.println(i);
        }

        linearSearch(arr,15);
    }
}
