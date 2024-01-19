import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
    }

    public static int sumOfDigits(int input) {

        if(input < 10){
            return input ;
        }

        return input % 10 + sumOfDigits(input/10);
    }
}
