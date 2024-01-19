import java.util.Scanner;

class swapAlternate {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = takeInput();
        swapAlt(arr);
        printArray(arr);
    }



    // SWAP ALTERNATE METHOD
    public static void swapAlt(int[] arr) {
        int n = arr.length;

        // MY THOUGHT OF SOLVING
        // if (n % 2 == 0) {
        //     for (int i = 0; i < n; i++) {
        //         if (i % 2 == 0) {
        //             int temp = arr[i];
        //             arr[i] = arr[i + 1];
        //             arr[i + 1] = temp;
        //         }
        //     }
        // } else {
        //     for (int i = 0; i < n - 1; i++) {
        //         if (i % 2 == 0) {
        //             int temp = arr[i];
        //             arr[i] = arr[i + 1];
        //             arr[i + 1] = temp;
        //         }
        //     }
        // }



         //SEEN SOLUTION 

         for(int i = 0 ; i < n - 1; i+= 2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
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