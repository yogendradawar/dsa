import java.util.Scanner;

public class arrayRotation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arr");
        int arr[] = takeInput();
        System.out.println("Enter the number for rotation: ");
        int value = sc.nextInt();
        System.out.println("Enter direction of rotation: ");
        String direction = sc.next();

       rotation(arr,value,direction);
        printArray(arr);
    }

    // ROTATION METHOD

    public static void rotation(int[] a, int value, String direction) {

        // MY THOUGHT OF SOLVING

        int n = a.length;
        value = value % n;

        if(direction.equals("LEFT")){
            leftRotation(a,value);
        }
        else{
            rightRotation(a,value);
        }
        // SEEN SOLUTION

    }

        // LEFT ROTATION METHOD 

        public static void leftRotation(int [] arr, int value){
            int n = arr.length;
            reverse(arr, 0, value-1);
            reverse(arr, value, n-1);
            reverse(arr, 0, n-1);
        }

        // RIGHT ROTATION METHOD    
        public static void rightRotation(int [] arr, int value){
            int n = arr.length;
            reverse(arr, n-value , n-1 );
            reverse(arr,0, n-value-1);
            reverse(arr,0, n-1);
        }


        //REVERSE METHOD

        public static void reverse(int arr[] , int start , int end){
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
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
