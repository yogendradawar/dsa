import java.util.Scanner;
public class stairCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Stairs ");
        int num = sc.nextInt();
        System.out.println(staircase(num));
    }

    public static int staircase(int n) {
        if(n == 0){
            return 1;
        }

        if(n < 0){
            return 0;
        }

        return staircase(n-1) + staircase(n-2) + staircase(n -3);
    }
}
