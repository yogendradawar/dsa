package dsa.Introduction_To_Java.Week_1.Flow_Chart_1;

import java.util.Scanner;
class averageOfThreeNumbers{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter the number 2");
        int num2 = sc.nextInt();

        System.out.println("Enter the number 3");
        int num3 = sc.nextInt();

        int average = num1 + num2 + num3;

        System.out.println("Average: " + average/3);

    }
}