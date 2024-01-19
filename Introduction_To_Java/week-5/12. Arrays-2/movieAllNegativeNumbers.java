import java.util.Scanner;
public class movieAllNegativeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = takeInput();
        // printArray();
        arrangeNumbers(arr);
        printArray(arr);
    }

    // PAIR SMALLEST DIFFERENCE METHOD

    public static void arrangeNumbers(int[] a) {

        // MY THOUGHT OF SOLVING

            // int i  = 0 ;
        // int j = 0;

        // while(i<a.length && j <a.length){
        //     if(a[j]>0){
        //         j++;
        //     }
        //     else if(a[i]<0){
        //         i++;
        //     }
        //     else{
        //     int temp = a[i];
        //     a[i] = a[j];
        //     a[j] = temp;
        //     i++;
        //     j++;
        //     }
        // }

        // SEEN SOLUTION

        int i  = 0 ;
        int j = a.length - 1;

        while( i < j){
            if(a[i]<0){
                i++;
            }
            else if(a[j]>0){
                j--;
            }
            else{
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

    }

    //SORTING METHOD

    //INSERTION SORTING

    public static void sort(int []arr, int n){
        for(int i = 1; i < n ; i++ ){
            int j = i -1;
            int temp = arr[i];
            while( j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    //MAKE POSITIVE METHOD

    public static int makePositive(int num){
        if(num < 0){
            return -num;
        }
        else{
            return num;
        }
    }

    // SWAP METHOD

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
