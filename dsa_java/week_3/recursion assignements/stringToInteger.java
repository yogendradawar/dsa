import java.util.Scanner;

public class stringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to convert into Number");
        String str = sc.next();

        System.out.println(convertStringToInt(str));
    }

    public static int convertStringToInt(String str) {
        if (str.length() == 1) {
            return str.charAt(0) - '0';
        }

        int smallOutput = convertStringToInt(str.substring(0, str.length() - 1));

        int digitOutput = str.charAt(str.length()-1) - '0';

        return smallOutput*10 + digitOutput;
    }
}
