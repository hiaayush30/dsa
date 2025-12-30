package linear_ds.array;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        int target = 15;

        for(int i:arr){
            System.out.println(i);
        }

        // linear search
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                System.out.println("target found at index "+ i);
            }
        }
    }
}
