import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

               int arr[] = takeInput();
               insertion(arr);
               printArray(arr);
            //    System.out.println(ans);
           }
       
       
       
           // INSERTION SORT  METHOD
           public static void insertion(int[] arr) {
       
               // MY THOUGHT OF SOLVING
                int n = arr.length;
                for(int i = 1 ; i < n ; i++){
                    int j = i -1;
                    int temp = arr[i];
                    while( j >=0 && arr[j] > arr[j+1]){
                        // arr[j+1] = arr[j];
                        // arr[j] = temp;
                        swap(arr,j,temp);
                        j--;
                    }
                    arr[j+1] = temp;
                }
                //SEEN SOLUTION  
            }

            //SWAP METHOD

            public static void swap(int arr[] , int j, int temp){
                arr[j+1] = arr[j];
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
