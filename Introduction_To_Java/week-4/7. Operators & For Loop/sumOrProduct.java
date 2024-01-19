import java.util.Scanner;

public class sumOrProduct {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = sc.nextInt();

        System.out.println("Enter the choice : ");
        System.out.println("1. for print the sum");
        System.out.println("2. for print the product ");

        int choice = sc.nextInt();

        if(choice == 1){
            int sum = 0;
            for(int i = 1 ; i <= number ; i++){
                sum += i;
            }
            System.out.print(sum);
        }
        else if (choice == 2){
            int product = 1;
            for(int i = 1; i <=number ; i++){
                product *= i;
            }
            System.out.print(product);
        }
        else{
            System.out.println("You have entered the wrong choice : " + choice);
        }
     }
    }