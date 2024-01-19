package dsa.Introduction_To_Java.Week_1.Flow_Chart_1;
import java.util.Scanner;
class validTriangle{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the coordinates number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter the coordinates number 2");
        int num2 = sc.nextInt();

        System.out.println("Enter the coordinates number 3");
        int num3 = sc.nextInt();

        if (num1 + num2 > num3 && num1 + num3 > num2 && num2 + num3 > num1) {
            System.out.println("This is a valid triangle");
        } else {
            System.out.println("This is not a valid triangle");
        }

    }
}