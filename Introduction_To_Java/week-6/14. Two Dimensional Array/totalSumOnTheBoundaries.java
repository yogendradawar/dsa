import java.util.Scanner;

public class totalSumOnTheBoundaries {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = sc.nextInt();
        System.out.println("Enter the column");
        int column = sc.nextInt();
        int arr[][] = new int[row][column];
        takeInput(arr, sc);
        totalSum(arr);
        }

    // BOUNDARIES METHOD
    public static void totalSum(int[][] mat){
      int sum = 0;
		int n = mat.length;
		//boundarie elements
		if(mat.length == 0){
			System.out.println(0);
			return ;
		}

		// row & columns

		for(int i = 0 ; i < mat[0].length ; i++){
			sum += mat[0][i];
			sum += mat[n-1][i];
		}

		for(int i = 1; i < mat.length - 1 ; i++){
				sum += mat[i][0];
				sum += mat[i][n-1];
		}

		// diagonals
		for(int i = 1; i < n-1 ; i++){
			 sum += mat[i][i]; 
            sum += mat[i][n - 1 - i]; 

			if(n % 2 != 0 && i== n/2){
				sum -= mat[i][i];
			}
		}
	

		System.out.println(sum);
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
