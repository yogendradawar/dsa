package dsa.Introduction_To_Java.week_3.patterns1_5;
import java.util.Scanner;
public class squarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        int i = 1;
        while(i<=number){
            int j = 1;
            while(j<=number){
                System.out.print(number);
                j++;
            }
            System.out.println();

            i++;
        }
    }
}
