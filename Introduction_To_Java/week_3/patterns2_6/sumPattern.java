package dsa.Introduction_To_Java.week_3.patterns2_6;
import java.util.Scanner;

public class sumPattern {
    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int i = 1;
        int sum = 0;
        while (i <= number) {
            sum += i;
            int num = 1;
            while (num <= i) {
                System.out.print(num);
                if (num == i) {
                    System.out.print("=");
                } else {
                    System.out.print("+");
                }
                num++;
            }
            System.out.println(sum);
            i++;
        }
    }
}
