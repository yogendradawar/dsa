import java.util.Scanner;

public class calculatePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        System.out.println("Enter the power :");
        int power = sc.nextInt();

        System.out.println("Ans: " + power(num , power));
    }

    public static int power(int num, int power) {
        if(power <= 0){
            return 1;
        }

        if(num == 0){
            return 0;
        }

        return num * power(num, power-1);
    }

}
