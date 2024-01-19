package dsa.Introduction_To_Java.week_2.Conditionals_and_Loops_4;
import java.util.Scanner;
public class findCharacterCase {
    public static void main(String[] args){
        System.out.println("Enter the character: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next() .charAt(0);

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("1");
        }
        else if(ch >= 'a' && ch <= 'z'){
            System.out.println("0");
 
        }
        else{
            System.out.println("-1");
        }
}
}
