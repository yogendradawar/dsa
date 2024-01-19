package dsa.Introduction_To_Java.week_2.Conditionals_and_Loops_4;
import java.util.Scanner;
public class findAPowerOfANumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int number = sc.nextInt();

        System.out.println("Enter the power of number :");
        int power = sc.nextInt();

        int ans = 1;
        while(power > 0){
            ans = ans * number;
            power --;
        }
        System.out.println("The power of number " + number + " is " + ans);
    }
}
