import java.util.Scanner;

public class compressTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();

        String ans = getCompressedString( str);
           System.out.println(ans);
       }
   
       //  COMPRESSED METHOD
   
       public static String getCompressedString(String str) {
   
           // MY THOUGHT OF SOLVING
        	
           String comprased = "";
           char prevChar = str.charAt(0);
           int count = 1;
   
           for(int i = 1 ; i < str.length() ; i++){
               if(prevChar == str.charAt(i)){
                   count ++;
               }
               else {
                   if(count > 1){
                       comprased += prevChar + Integer.toString(count);
                   }
                   else{
                       comprased += prevChar;
                   }
                   prevChar = str.charAt(i);
                   count = 1;
               }
           }
   
           if(count > 1){
               comprased += prevChar + Integer.toString(count);
           }
           else{
               comprased += prevChar ;
           }
   
           return comprased;


           // SEEN SOLUTION
       }
}
