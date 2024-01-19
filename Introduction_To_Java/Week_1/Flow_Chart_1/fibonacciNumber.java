package dsa.Introduction_To_Java.Week_1.Flow_Chart_1;

import java.util.Scanner;
class fibonacciNumber{
    public static void main (String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number");
    int number = sc.nextInt();
    int a = 0;
    int b = 1;
    int c = 0;
    System.out.print(a+" " );
    System.out.print(b+" " );

    for(int i = 2 ; i < number ; i++){
        c = a + b;
        a = b;
        b = c;
        System.out.print(c+" " );
    }
}
}