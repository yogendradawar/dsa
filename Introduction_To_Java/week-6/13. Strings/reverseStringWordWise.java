import java.util.Scanner;

public class reverseStringWordWise {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
          
        String ans = reverseWordWise(str);
           System.out.println(ans);
       }
   
       //  REVERSE WORD WISE METHOD
   
       public static String reverseWordWise(String input) {
   
           // MY THOUGHT OF SOLVING
        //    String str ="";
			
		// 	int end = input.length();
		// 	for(int i = input.length()-1 ; i >=0 ;i--){
		// 		if(input.charAt(i) ==  ' '){
		// 			int start = i + 1;
		// 			str = str + input.substring( start, end) + " ";
		// 			end = i;
		// 		}
		// 	}
		// 	str += input.substring(0,end);

		// 	return str;
           
           // SEEN SOLUTION

           int end  = input.length() ;
           int i = input.length() - 1;
            String output = "";
            while(i>=0){
                if(input.charAt(i) == ' '){
                    output = output + input.substring(i+1, end) + " ";
                    end = i ;
                }
                i--;        
            }

            output += input.substring(i + 1, end);
            return output; 
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
