package dsa.Introduction_To_Java.week_2.Conditionals_and_Loops_4;
import java.util.Scanner;

class positiveOrNegative{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number Wheather check its positive or negative: ");

        int number = sc.nextInt();

        if(number<0){
            System.out.println(number+" is negative");
        }
        else{
            System.out.println(number + " is positive");
        }
}
}