package dsa.Introduction_To_Java.week_2.Conditionals_and_Loops_4;
import java.util.Scanner;
public class remarkStudent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks for the students");
        int mark = sc.nextInt();

        if (mark >75 && mark<=100){
            System.out.println("Distinction");
        }
        else if(mark > 50 && mark <= 75){
            System.out.println("Average");
        }
        else{
            System.out.println("Below Average");
        }
        
}
}
