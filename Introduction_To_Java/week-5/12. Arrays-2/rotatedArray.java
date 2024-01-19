import java.util.Scanner;

public class rotatedArray {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = takeInput();

        System.out.println("Enter the value of left rotations: ");
        int value = sc.nextInt();
        value = value % arr.length;
        rotate(arr , value);
        printArray(arr);
        // System.out.println(ans);
    }

    // ROTATE ARRAY METHOD

    public static void rotate(int[] arr,int value) {

        // MY THOUGHT OF SOLVING

        int n = arr.length;
        reverse(arr, 0, value-1);
        reverse(arr, value, n-1);
        reverse(arr, 0, n-1);
        // SEEN SOLUTION

    }
    
    //lEFT ROTATION METHOD

    public static void reverse(int arr[] , int start , int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // TAKE INPUT METHOD
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int arr = sc.nextInt();
        int arr1[] = new int[arr];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter element at " + i + "th index");
            arr1[i] = sc.nextInt();
        }
        return arr1;
    }

    // PRINT ARRAY METHOD
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
