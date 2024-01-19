import java.util.Scanner;

public class removeDuplicateRecursively {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.next();

        System.out.println("New String is : "+ removeConsecutiveDuplicates(str));
    }

        public static String removeConsecutiveDuplicates(String str) {
            if(str.length() == 1){
                return str;
            }
            if(str.charAt(0) == str.charAt(1)){
                return removeConsecutiveDuplicates(str.substring(1));
        }
        else{
            return str.charAt(0) + removeConsecutiveDuplicates(str.substring(1));
        }
}
}
