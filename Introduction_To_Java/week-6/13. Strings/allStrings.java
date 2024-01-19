import java.util.Scanner;
public class allStrings {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.next();
          
        printSubstrings(str);
        //    System.out.println(ans);
       }
   
       // ALL STRING SUB STRINGS METHOD
   
       public static void printSubstrings(String str) {
   
           // MY THOUGHT OF SOLVING
           for(int i = 0 ; i < str.length(); i++) {
            for(int j = i ; j < str.length() ; j++) {
                System.out.println(str.substring(i, j + 1));
            }
           }
           
           // SEEN SOLUTION
   
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
       public static void printArray(String[] arr) {
           for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");
           }
       }
    }

