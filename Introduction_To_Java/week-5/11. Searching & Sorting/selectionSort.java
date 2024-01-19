import java.util.Scanner;

class selectionSort{
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
       
               int arr[] = takeInput();
               selection(arr);
               printArray(arr);
            //    System.out.println(ans);
           }
       
       
       
           // SELECTION SORT  METHOD
           public static void selection(int[] arr) {
       
               // MY THOUGHT OF SOLVING
                int n = arr.length;
                for(int i = 0 ; i < n - 1; i++){
                    int minElement  = Integer.MAX_VALUE;
                    int minIndex = -1;
                    for(int j = i; j < n; j++){
                        if(arr[j]< minElement){
                        minElement = arr[j];
                        minIndex = j;
                        }
                    }
                    arr[minIndex] = arr[i];
                    arr[i] = minElement;
                }
       
                //SEEN SOLUTION 
               
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