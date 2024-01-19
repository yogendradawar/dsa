import java.util.Scanner;

public class nthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        int f1 = 1;
        int f2  = 1;
        if(number == 1){
            System.out.print(f1 );
        }
        else if(number == 2){
            System.out.print(f1 + f2);
        }
        else {
            for(int i  = 3 ; i <= number ; i++){
                int temp = f1 + f2;
                f1 = f2;
                f2 = temp;
            }
            System.out.print(f2);
        }
    }
}
