package dsa.Introduction_To_Java.week_3.patterns2_6;
import java.util.Scanner;
class invertedNumberPattern {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number: ");

    int number = sc.nextInt();

    int i = 1;

    while(i<= number){
        int j = 1;
        while(j <= number - i + 1){
            System.out.print(number - i + 1);
            j++;
        }
        System.out.println();
        i++;
    }
 }   
}