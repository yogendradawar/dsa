package dsa.Introduction_To_Java.Week_1.Getting_Started_with_Java_2;

import java.util.Scanner;
public class averageMarkes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name in Single Character: ");

        char name = sc.next().charAt(0);

        System.out.println("Enter the marks of 1 test: ");
        int marks1 = sc.nextInt();

        System.out.println("Enter the marks of 2 test: ");
        int marks2 = sc.nextInt();

        System.out.println("Enter the marks of 3 test: ");
        int marks3 = sc.nextInt();

        int average = (marks1 + marks2 + marks3) / 3;

        System.out.println(name);
        System.out.println(average);
    }
}
