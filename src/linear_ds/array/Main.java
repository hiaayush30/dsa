package linear_ds.array;
import java.util.Scanner;

// Array stores elements of same type
// elements stored in contiguous memory location
// size of array fixed, does not change at runtime
// the array if uninitialized will store null values ( like false in case of boolean)
// they are passed by reference

// Input Output and Update arrays
public class Main {
    public static void update(boolean[] arr){
        arr[1] = false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[5];
        arr[0] = true;
        System.out.println("Enter a boolean value");
        if(sc.hasNextBoolean()) {
            arr[1]= sc.nextBoolean();
        }
        update(arr);
        System.out.println(arr[1]);
    }
}
