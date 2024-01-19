package dsa.Introduction_To_Java.week_3.patterns2_6;
import java.util.Scanner;

public class starPattern {
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
            while(star <= (2 * i) - 1){
                System.out.print("*");
                star++;
            }
            // int dec = i - 1;
            // while(dec >= 1){
            //     System.out.print("*");
            //     dec--;
            // }
            System.out.println();
            i++;
        }
}
}
