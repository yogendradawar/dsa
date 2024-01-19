import java.util.Scanner;

public class numberOfDigits {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit :");
        int num = sc.nextInt();

        System.out.println("Counted Digits are: " + countDigits(num));
    }

    public static int countDigits(int num) {
        if(num == 0){
            return 0;
        }

        return 1 + countDigits(num / 10);
    }
}
