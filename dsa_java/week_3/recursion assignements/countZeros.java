import java.util.Scanner;

public class countZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        System.out.println(countZeros(n));
    }

    public static int countZeros(int n) {
        if(n < 10){
            if(n == 0){
                return 1;
            }
            else{
                return 0;
            }
        }

        if(n % 10 == 0){
            return 1 + countZeros(n/10);
        }
        else{
            return 0 + countZeros(n/10);
        }  
    }
}
