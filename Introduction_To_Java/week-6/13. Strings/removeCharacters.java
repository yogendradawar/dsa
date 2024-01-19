import java.util.Scanner;

public class removeCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        System.out.println("Enter the Character :");
        char x = sc.next().charAt(0);

        String ans = removeAllOccurrencesOfChar(str, x);
           System.out.println(ans);
       }
   
       //  REVERSE EACH WORD METHOD
   
       public static String removeAllOccurrencesOfChar(String str, char ch) {
   
           // MY THOUGHT OF SOLVING
        	
           String output = "";

           for(int i = 0 ;  i < str.length() ; i++){
               if(ch != str.charAt(i)){
                   output = output + str.charAt(i);
               }
           }
   
           return output;
           // SEEN SOLUTION
       }
}
