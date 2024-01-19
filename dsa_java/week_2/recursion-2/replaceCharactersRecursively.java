import java.util.Scanner;

public class replaceCharactersRecursively {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.next();

        System.out.println("Enter the replacement character :");
        char c = sc.next().charAt(0);

        System.out.println("Enter the other replacement character :");
        char c1 = sc.next().charAt(0);

        System.out.println("Words without x are : "+ replaceCharacter(str,c,c1));
    }

        public static String replaceCharacter(String str,char c, char c1) {

            if(str.length() == 0){
                return "";
            }

            if(str.charAt(0) == c){
                return c1 + replaceCharacter(str.substring(1),c,c1);
            }
            else{
                return str.charAt(0) + replaceCharacter(str.substring(1), c, c1);
            }
        }
    
}
