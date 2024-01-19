package dsa.Introduction_To_Java.week_2.Conditionals_and_Loops_4;
import java.util.Scanner;
public class sumOfEvenAndOdd {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();
        int even = 0 ;
        int odd = 0;
        while(number != 0){
            int num = number % 10;
            if(num % 2 == 0){
                even = even + num;
        }
        else{
            odd = odd + num;
        }
        number = number / 10 ;
    }

    System.out.println(even);
    System.out.println(odd);
    }
}
