import java.util.Scanner;

public class reverseEachWords {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();

        String ans = reverseEachWord(str);
           System.out.println(ans);
       }
   
       //  REVERSE EACH WORD METHOD
   
       public static String reverseEachWord(String str) {
   
           // MY THOUGHT OF SOLVING
        	
		
           String output = "";
           int start = 0;
           for(int i = 0 ; i < str.length() ; i++){
               String ans = "";
               if(str.charAt(i) == ' '){
                   for( ; start < i ; start++){
                       ans = str.charAt(start) + ans;
                   }
                   output = output + ans + " ";
                   start = i +1;
               }
           }
   
            // Reverse the last word (if any) outside the loop
           String lastWord = "";
           for (; start < str.length(); start++) {
               lastWord = str.charAt(start) + lastWord;
           }
           output = output + lastWord;
   
           
           return output;
           
           // SEEN SOLUTION
       }
}
