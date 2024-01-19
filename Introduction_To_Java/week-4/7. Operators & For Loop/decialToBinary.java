import java.util.Scanner;
public class decialToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
       long ans = 0;
        long pow = 1;
        while(number > 0){
            int lastBit = number % 2;
            ans = ans + lastBit * pow;
            pow = pow * 10;
            number = number / 2;
        }

        System.out.print(ans);
    }
}
