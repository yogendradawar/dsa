import java.util.Scanner;

public class secondLargestInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = takeInput();
        int ans = secondLargestElement(arr , arr.length );
        // printArray(output);
        System.out.println(ans);
    }

    // SECOND LARGEST ELEMENT METHOD

    public static int secondLargestElement(int[] arr,int n) {

        // MY THOUGHT OF SOLVING

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (secondLargest < arr[i] && secondLargest != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;

        // SEEN SOLUTION

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
