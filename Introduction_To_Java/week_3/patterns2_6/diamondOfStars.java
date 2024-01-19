package dsa.Introduction_To_Java.week_3.patterns2_6;
import java.util.Scanner;

public class diamondOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int number = sc.nextInt();

        int part1 = 1;
        while (part1 <= (number + 1) / 2) {

            int dot1 = 1;
            int stop1 = (number + 1) / 2;

            while (dot1 <= stop1-part1) {
                System.out.print(' ');
                dot1++;
            }

            int star1 = 1;
            while(star1 <= (2 * part1) - 1){
                System.out.print("*");
                star1++;
            }
            System.out.println(" ");
            part1++;
        }

        int part2 = number/2;
        int end = number / 2;
        while(part2 >= 1){

            int dot2 = 1;
            while(dot2 <= end - part2 + 1){
                System.out.print(' ');
                dot2++;
            }

            int star2 = 1;
            while(star2 <= 2 *part2 - 1){
                System.out.print("*");
                star2++;
        }
        part2--;
        System.out.println();
    }
    }
}
