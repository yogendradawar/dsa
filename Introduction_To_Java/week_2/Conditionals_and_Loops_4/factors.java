package dsa.Introduction_To_Java.week_2.Conditionals_and_Loops_4;
import java.util.Scanner;
public class factors {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        boolean ans = false;
        int i = 2;
        while(i <= number / 2 ){
            if(number % i ==0){
                System.out.print(i+ " ");
                ans = true;
            }
            i++;
        }

        if(!ans){
            System.out.println("-1");
        }
    }
}
