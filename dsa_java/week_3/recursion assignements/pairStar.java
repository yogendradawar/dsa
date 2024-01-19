import java.util.Scanner;

public class pairStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        System.out.println(addStars(str));
    }

    public static String addStars(String str) {
        if(str.length() == 1){
            return str;
        }

        if(str.charAt(0) == str.charAt(1)){
            return str.charAt(0) + "*" + addStars(str.substring(1)); 
        }
        else{
            return str.charAt(0) + addStars(str.substring(1));
        }
    }
}
