import java.util.Scanner;

public class highestOccuringCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();

        char ans = highestOccuringChar( str);
           System.out.println(ans);
       }
   
       //  HIGHEST OCCURED CHAR METHOD
   
       public static char highestOccuringChar(String str) {
   
           // MY THOUGHT OF SOLVING
        	
           int [] charCount = new int [26];
		int max = 0 ;
		char ch = '\0';

		for(int i = 0 ; i < str.length() ; i++){
			int charIndex = str.charAt(i) - 'a';
			charCount[charIndex] += 1;
		}

		for(int i = 0 ; i < charCount.length ; i++){
				if(charCount[i] > max){
					max = charCount[i];
					ch = (char) (i + 'a');
				}
		}


		return ch;
           // SEEN SOLUTION

    //        int [ ] charCount = new int[26];
    //        int maxCount = 0;
           
    //        for(int  i = 0 ; i < str.length() ; i++){
    //            int charIndex = str.charAt(i) - 'a';
    //            charCount [charIndex] += 1;
    //            maxCount = Math.max(maxCount, charCount[charIndex]);
    //        }
   
    //        char ch = '\0';
   
    //        for(int i = 0 ; i < charCount.length ; i++){
    //            if(maxCount == charCount[i]){
    //                ch = (char) (i+'a');
    //                break;
    //            }
    //        }
   
    //        return ch;
       }
}
