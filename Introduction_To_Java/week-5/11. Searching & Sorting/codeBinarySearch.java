import java.util.Scanner;
public class codeBinarySearch {
    
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
       
               int arr[] = takeInput();
               System.out.println("Enter the target value: ");
               int target = sc.nextInt();
               int ans = binarySearch(arr, target);
               System.out.println(ans);
           }
       
       
       
           // BINARY SEARCH METHOD
           public static int binarySearch(int[] arr, int target) {
       
               // MY THOUGHT OF SOLVING
                int n = arr.length;
                int start = 0;
                int end = n-1;

                while(start <= end){
                    int mid = (start + end) / 2;

                    if(arr[mid] == target){
                        return mid;
                }
                else if(arr[mid] > target){
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }       
            }

            return -1;
       
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
