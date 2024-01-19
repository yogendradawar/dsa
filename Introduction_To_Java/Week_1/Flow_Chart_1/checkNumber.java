package dsa.Introduction_To_Java.Week_1.Flow_Chart_1;

import java.util.Scanner;
class checkNumber {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check");

        int num = sc.nextInt();

        if (num > 0) {
            System.out.print("1");
        } else if (num < 0) {
            System.out.print("-1");
        }
        else{
            System.out.println("0");
        }
    }
}