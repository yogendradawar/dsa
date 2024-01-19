package dsa.Introduction_To_Java.week_3.patterns1_5;
import java.util.Scanner;
public class trinagleNumberPattern {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int i = 1;
        while(i<=number){
            int j = 1;
            while(j<=i){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
