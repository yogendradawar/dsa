package dsa.Introduction_To_Java.Week_1.Getting_Started_with_Java_2;
import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the Principal amount: ");
        int Principal = sc.nextInt();

        System.out.println("Enter the rate: ");
        double rate = sc.nextDouble();

        System.out.println("Enter the time: ");
        int time = sc.nextInt();

        int simpleInterest =  (int)(Principal * rate * time ) / 100;

        System.out.println("Simple Interest : " + simpleInterest);
    }
}
