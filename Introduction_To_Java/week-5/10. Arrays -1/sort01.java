import java.util.Scanner;

public class sort01 {
    public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);

        int arr[] = takeInput();

        sort(arr);
        printArray(arr);
        // System.out.println(arr);
    }



    // SORT 0 1 METHOD
    public static void sort(int[] arr) {

        // MY THOUGHT OF SOLVING
    //    int left = 0 ;
    //     int right = arr.length - 1;

    //     while(left < right ){
    //         if(arr[left] ==0 ){
    //             left++;
    //         }
    //         else if(arr[right] == 1){
    //             right--;
    //         }
    //         else {
    //             int temp = arr[left];
    //             arr[left] = arr[right];
    //             arr[right] = temp;
    //              left++;
    //             right--;
    //         }
    //     }



         //SEEN SOLUTION 

         int countOne = 0;

         for(int i = 0 ; i < arr.length ; i++){
             if(arr[i] == 0){
                 int temp = arr[countOne];
                 arr[countOne] = arr[i];
                 arr[i] = temp;
                 countOne += 1;
             }
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
