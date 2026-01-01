package linear_ds.array;

public class ReverseAnArray {
    // O(1) space and O(n) time complexity
    public static void reverseArray(int[] arr){
        for (int i = 0; i < arr.length/2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        System.out.println("sorted array:");
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
        }

        for(int i:arr){
            System.out.println(i);
        }

        reverseArray(arr);
    }
}
