package dsa.Introduction_To_Java.week_3.patterns2_6;
import java.util.Scanner;

public class trianglesOfNumbers {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int number = sc.nextInt();

        int i = 1;
        while (i <= number) {
            int space = 1;
            while (space <= number - i ) {
                System.out.print(' ');
                space++;
            }
            int star = 1;
            int num = i;
            while(star <= i){
                System.out.print(num);
                num++;
                star++;
            }
            int dec = i - 1; 
            int num1 = 2 * i - 2;
            while(dec >= 1){
                System.out.print(num1);
                num1--;
                dec--;
            }
            System.out.println();
            i++;
        }
}
}