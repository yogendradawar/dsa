import java.util.Scanner;

public class multiplication {
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the time of addition to multiplication");
            int m = sc.nextInt();
            System.out.println("Entet the number ");
            int n = sc.nextInt();

            System.out.println(multiplyTwoIntegers(m,n));
        }

        public static int multiplyTwoIntegers(int m, int n) {
            if(m == 0 || n ==0){
                return 0;
            }

            return n + multiplyTwoIntegers(m-1,n);
        }
}
