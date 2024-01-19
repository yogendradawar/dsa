package dsa.Introduction_To_Java.week_2.Conditionals_and_Loops_4;
import java.util.Scanner;

class multipleof5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the number Wheather check its multiple of 5: ");
        int number = sc.nextInt();

        if(number % 5 == 0){
            System.out.println(number + " is multiple of 5");
        }
        else{
            System.out.println(number + " is not multiple of 5");
        }

    }
}