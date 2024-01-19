import java.util.Scanner;

public class removeConsecutiveDuplicates {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();

        String ans = duplicated(str);
           System.out.println(ans);
       }
   
       //  DUPLICATES METHOD
   
       public static String duplicated(String str) {
   
           // MY THOUGHT OF SOLVING
        	
		String output = "";
		output = str.charAt(0) +"" ;
		char last = str.charAt(0);
		for(int i = 1 ; i < str.length() ; i++){
			if(str.charAt(i) != last){
				output += str.charAt(i);
				last = str.charAt(i);
			}
		}

		return output;
           
           // SEEN SOLUTION
       }
   
       }
