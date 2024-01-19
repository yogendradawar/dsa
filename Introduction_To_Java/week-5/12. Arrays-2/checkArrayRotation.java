import java.util.Scanner;

class checkArrayRotation{
        public static void main(String[] args) {
        
        
     Scanner sc = new Scanner(System.in);
        int arr[] = takeInput();
        // printArray();
        int ans = arrayRotateCheck(arr);
        System.out.println(ans);
    }

    //  ARRAY ROTATION CHECK    METHOD

    public static int arrayRotateCheck(int[] a) {

        // MY THOUGHT OF SOLVING

        // int n = a.length;
        // int ans = 0;
        // for(int i = 0; i < n-1; i++) {
        //     if(a[i] > a[i+1]){
        //         return ans = i +1;
        //     }
        // }

        // return ans;


        
        // SEEN SOLUTION

        int n = a.length;
        for(int i = 0; i < n-1; i++) {
            if(a[i] > a[i+1]){
                return i +1;
            }
        }

        return 0;

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