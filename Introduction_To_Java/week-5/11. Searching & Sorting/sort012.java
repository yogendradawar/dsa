import java.util.Scanner;

public class sort012 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

               int arr[] = takeInput();
               sort(arr);
               printArray(arr);
            //    System.out.println(ans);
           }
       
       
       
           //  SORT 0 1 2  METHOD
           public static void sort(int[] arr) {
       
               // MY THOUGHT OF SOLVING
               int n  = arr.length ; 
               //SELECTION SORT
              
               // for(int i = 0 ; i < n-1; i++ ){
               //     int min = Integer.MAX_VALUE;
               //     int index = 0;
               //     for(int j = i +1 ; j < n ; j++){
               //             if(arr[j] < min){
               //                 min = arr[j];
               //                 index = j;
               //             }
               //     }
               //     int temp = min;
               //     arr[index] = arr[i];
               //     arr[i] = temp;
               // }
       
       
               // BUBBLE SORT
       
           //     for(int i = 0 ; i < n-1; i++){
           //     for(int j = 0 ; j < n - i - 1 ; j++){
           //         if(arr[j] > arr[j+1]){
           //             int temp = arr[j];
           //             arr[j] = arr[j+1];
           //             arr[j+1] = temp;
           //         }
           //     }
           // }
       
       
           //INSERTION SORT METHOD 
       
           // for(int i = 1 ; i < n ; i++){
           //     int j = i -1 ;
           //     int temp = arr[i];
           //     while(j >= 0 && arr[j] >temp){
           //             arr[j+1] = arr[j];
           //             j--;
           //     }
           //     arr[j+1] = temp;
           // }
                //SEEN SOLUTION  


                int start = 0 ;
                int end = n-1;
                int i = 0;
            
                while(i<= end){
                    if(arr[i] == 0){
                        swap(arr,start,i);
                        // int temp = arr[i];
                        // arr[i] = arr[start] ;
                        // arr[start] = temp;
                        i++;
                        start++;
                    }
                    else if(arr[i] == 1){
                        i++;
                    }
                    else{
                        swap(arr,i,end);
                        // int temp = arr[end];
                        // arr[end] = arr[i];
                        // arr[i] = temp;
                        end--;
                    }
                }

                
            }

            //SWAP METHOD

            public static void swap(int arr[] , int i, int j){
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
