import java.util.Scanner;

public class queryAndMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row");
        int row = sc.nextInt();

        System.out.println("Enter the column");
        int column = sc.nextInt();

        int arr[][] = new int[row][column];

        System.out.println("enter the value of querys");

        int query = sc.nextInt();
        sc.nextLine();
        String[] queries = new String[query];
        takeQuery(queries, sc, query);

        int result[] = querys(arr, row, column, queries);

        for(int i = 0 ; i < result.length; i++) {
            System.out.println(result[i]+" ");
        }       

        // print(result, sc);
    }

    // QUERY METHOD
    public static int[] querys(int[][] mat, int m, int n, String[] q) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < q.length; i++) {
            String query = q[i];
            int queryType = query.charAt(0) - '0';
            if (queryType == 2) {
                count++;
            }
        }

        int[] ans = new int[count];

        for (int i = 0; i < q.length; i++) {

            String query = q[i];

            int queryType1 = query.charAt(0) - '0';
            char queryType2 = query.charAt(1);
            int queryType3 = query.charAt(2) - '0';

            if (queryType1 == 1) {
                if (queryType2 == 'R') {
                    rowFlip(mat, queryType3, n);
                } else {
                    columnFlip(mat, queryType3, m);
                }
            } else {
                int count1 = 0;
                if (queryType2 == 'R') {
                    count1 = countZeroInRow(mat, queryType3, n);
                } else {
                    count1 = countZeroInColumn(mat, queryType3, m);
                }
                ans[j] = count1;
                j++;
            }
        }
        return ans;
    }

    public static void rowFlip(int[][] mat, int rowIndex, int m) {
        for (int i = 0; i < m; i++) {
            mat[rowIndex][i] ^= 1;
        }
    }

    public static void columnFlip(int[][] mat, int columnIndex, int n) {
        for (int i = 0; i < n; i++) {
            mat[i][columnIndex] ^= 1;
        }
    }

    public static int countZeroInRow(int[][] mat, int rowIndex, int m) {
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (mat[rowIndex][i] == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countZeroInColumn(int[][] mat, int columnIndex, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (mat[i][columnIndex] == 0) {
                count++;
            }
        }
        return count;
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

    // TAKE QUERY METHOD

    public static void takeQuery(String[] queries, Scanner sc, int n) {
        for(int i = 0; i < n; i++){
            queries[i] = sc.nextLine();
        }
    }
}
