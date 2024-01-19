import java.util.Scanner;
public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        int ans = 0;
        int power = 1;
        while(number >0){
            ans = ans + number % 10 * power;
            power = power * 2;
            number = number / 10;
    }
    System.out.println(ans);
}
}
