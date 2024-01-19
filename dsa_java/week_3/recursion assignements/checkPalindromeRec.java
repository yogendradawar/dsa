import java.util.Scanner;
public class checkPalindromeRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String n = sc.next();
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(String str) {

        if(str.length() <=1){
            return true;
        }

        if(str.charAt(0) == str.charAt(str.length()-1)){
            return isPalindrome(str.substring(1, str.length()-1));
        }
        else{
            return false;
        }
    }
}
