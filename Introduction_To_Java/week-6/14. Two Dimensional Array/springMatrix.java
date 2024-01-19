
import java.util.Scanner;

public class springMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = sc.nextInt();
        System.out.println("Enter the column");
        int column = sc.nextInt();
        int arr[][] = new int[row][column];
        takeInput(arr, sc);
        int diag[] = new int[Math.min(row, column)];
        String ans = sqrMat(arr, row, column, diag);
        System.out.println(ans);

        if (ans.equals("YES")) {
            for (int i = 0; i < diag.length; i++) {
                System.out.print(diag[i] + " ");
            }
            System.out.println();
        }
    }

    // SPRING METHOD
    public static String sqrMat(int[][] mat, int n, int m, int diag[]) {
        if (n != m) {
            return "NO";
        } else {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if (i == j) {
                        diag[i] = mat[i][j];
                    }
                }
            }
            return "YES";
        }
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
