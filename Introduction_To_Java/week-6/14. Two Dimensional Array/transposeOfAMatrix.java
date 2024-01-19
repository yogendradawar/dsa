
import java.util.Scanner;

public class transposeOfAMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row");
        int row = sc.nextInt();

        System.out.println("Enter the column");
        int column = sc.nextInt();

        int arr[][] = new int[row][column];

        takeInput(arr, sc);

        int ans [][] = transpose(arr);

        printArray(ans, sc);
    }

    // TRANSPOSE METHOD
    public static int [][] transpose(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int ans [][] = new int[n][m];
		
		for(int i = 0 ; i < mat.length ; i++){
			for(int j = 0 ; j < mat[0].length ; j++){
				ans[j][i] = mat[i][j];
			}
		}
        return ans;
    }

    // PRINT ARRAY METHOD

    public static void print(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // PRINT 2D - ARRAY METHOD

    public static void printArray(int[][] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // TAKE INPUT METHOD
    public static void takeInput(int[][] arr, Scanner sc) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("Enter the element at" + i + " row " + j + " column ");
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
