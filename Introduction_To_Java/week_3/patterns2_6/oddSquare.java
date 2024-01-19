package dsa.Introduction_To_Java.week_3.patterns2_6;
import java.util.Scanner;

public class oddSquare {
public static void main(String[] args) {

     System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

            int  i = 1;
            int max = 2 * number -1;
            while( i <= number ){
                int j =1;
                int value = 2 * i -1;
                while(j <= number){
                    System.out.print(value);
                    value += 2;

                    if(value > max){
                        value = 1;
                    }
                    j++;
                }
                System.out.println();
                i++;
            }
        }
}
