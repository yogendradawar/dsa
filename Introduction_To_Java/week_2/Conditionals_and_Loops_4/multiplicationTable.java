package dsa.Introduction_To_Java.week_2.Conditionals_and_Loops_4;
import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of multiplication of table: ");
        int number = sc.nextInt();
        int i = 1;
        while(i <= 10){
            System.out.println(i * number );
            i++;
        }
    }
}
