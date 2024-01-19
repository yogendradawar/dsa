package dsa.Introduction_To_Java.week_3.patterns2_6;
import java.util.Scanner;
class halfDiamondPattern{
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        System.out.println("*");
        //first half
        int i = 1;
        while(i <= number){
            System.out.print("*");
            int j = 1;
            while(j <= i){
                System.out.print(j);
                j++;
            }
            j = j - 2;
            while( j >= 1){
                System.out.print(j);
                j--;
            }
            i++;
            System.out.println("*");
        }

        int col2 = 1;

        while(col2 <= number - 1){
            System.out.print("*");

            int currcol = 1;
            while(currcol <= number - col2){
                System.out.print(currcol);
                currcol++;
            }

            currcol = currcol - 2;
            
            while(currcol >= 1){
                System.out.print(currcol);
                currcol--;
            }

            System.out.println("*");
            col2++;
        }
        System.out.print("*");
    }
}