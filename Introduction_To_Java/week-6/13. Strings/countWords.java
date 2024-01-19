import java.util.Scanner;
public class countWords {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
            int ans = words(str);
          
        //    printArray(outp);
           System.out.println(ans);
       }
   
       //  ARRAY ROTATION CHECK METHOD
   
       public static int words(String str) {
   
           // MY THOUGHT OF SOLVING
           int count = 1 ;
           for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                count++;
            }
           }
            return count;
           
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
