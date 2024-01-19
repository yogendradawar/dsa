package dsa.Introduction_To_Java.week_2.How_is_Data_Stored_3;
import java.util.Scanner;
public class multiplyFloatingNumber {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number1 = input.nextInt();
        System.out.print("Enter another number: ");
        int number2 = input.nextInt();

        long product = (long) number1 * number2;
        System.out.println("product: " + product);
    }
}
