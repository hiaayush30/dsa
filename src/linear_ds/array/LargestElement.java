package linear_ds.array;

public class LargestElement {
    public static void largestElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max number is "+ max);
    }
    public static void main(String[] args) {
        int [] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
        }

        for(int i:arr){
            System.out.println(i);
        }

        largestElement(arr);
    }
}
