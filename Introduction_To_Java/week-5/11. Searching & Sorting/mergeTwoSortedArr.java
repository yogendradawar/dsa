import java.util.Scanner;
class mergerTwoSortedArr{
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
                System.out.println("Enter 1 sorted array");
               int arr1[] = takeInput();
               System.out.println("Enter 2 sorted array");
               int arr2[] = takeInput();
               int [] arr =merge(arr1, arr2);
               printArray(arr);
            //    System.out.println(ans);
           }
       
       
       
           // MERGE  METHOD
           public static int [] merge(int[] arr1, int[] arr2) {
       
               // MY THOUGHT OF SOLVING
               int arr[]= new int [arr1.length+ arr2.length];
               int index = 0;
               int i = 0;
               int j = 0;

               while(i< arr1.length && j< arr2.length) {

                if(arr1[i] < arr2[j]){
                    arr[index] = arr1[i];
                    i++;
                    index++;
                }
                else{
                    arr[index] = arr2[j];
                    j++;
                    index++;
                }
               }

               while(i<arr1.length) {
                arr[index] = arr1[i];
                i++;
                index++;
               }

               while(j<arr2.length) {
                arr[index] = arr2[j];
                j++;
                index++;
               }

                return arr;
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