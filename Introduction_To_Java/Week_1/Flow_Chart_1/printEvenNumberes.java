package dsa.Introduction_To_Java.Week_1.Flow_Chart_1;

import java.util.Scanner;
class printEvenNumbers{

    public static void main (String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       int number = sc.nextInt();

       for(int i= 1 ; i < number ; i++){
        if(i % 2 == 0){
            System.out.print(i+" ");
        }
   
    }
}
}
