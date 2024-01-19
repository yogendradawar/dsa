import java.util.Scanner;

public class findPairWithSmallestDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arr 1: ");
        int arr1[] = takeInput();
        System.out.println("enter arr 2: ");
        int arr2[] = takeInput();
        int ans = smallest(arr1, arr2, arr1.length, arr2.length);
        // printArray();
        System.out.println(ans);
    }

    // PAIR SMALLEST DIFFERENCE METHOD

    public static int smallest(int[] arr1, int[] arr2, int n, int m) {

        // MY THOUGHT OF SOLVING
        // SEEN SOLUTION

        sort(arr1, n);
        sort(arr2,m);
        int min = Integer.MAX_VALUE;
        int i = 0;
        int  j = 0;
        while(i<n && j<m){
            int diffrence = (arr1[i] - arr2[j]);
            if(diffrence < 0){
                diffrence = makePositive(diffrence);
            }
            if(diffrence < min){
                min =diffrence;
            }
            if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }

        return min;

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
