package dsa.Introduction_To_Java.Week_1.Flow_Chart_1;

import java.util.Scanner;
class findProducts{
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int product = 1;
        for(int i =1 ; i <= number ; i++){
            product  =  product * i;
        }

        System.out.println("Product of " + number + " is " + product);
    }
}