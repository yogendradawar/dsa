package dsa.Introduction_To_Java.week_3.patterns2_6;
import java.util.Scanner;

public class parallelogramPattern {
    public static void main(String[] args) {

     System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

            int  i = 1;
            while( i <= number ){
                int j = 1;

                while(j <= i-1){
                    System.out.print(' ');
                    j++;
                }

                int star = 1;
                while(star<= number){
                    System.out.print("*");
                    star++;
                }

                System.out.println();
                i++;
            }
        }
}
