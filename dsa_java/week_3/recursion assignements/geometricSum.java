import java.util.Scanner;
public class geometricSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(findGeometricSum(n));
    }

    public static double findGeometricSum(int k) {
        if(k == 0){
            return 1;
        }
        double a = (1 / Math.pow(2, k));
        return a + findGeometricSum(k-1);
    }
}
