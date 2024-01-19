package dsa.Introduction_To_Java.week_2.How_is_Data_Stored_3;
import java.util.Scanner;
public class printAsciiValue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = input.next().charAt(0);
        System.out.println("ASCII value of " + "'" + ch + "'" + "is " + (int)ch);
    }
}
