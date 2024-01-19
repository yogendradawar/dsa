import java.util.Scanner;

public class printLikeAWave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = sc.nextInt();
        System.out.println("Enter the column");
        int column = sc.nextInt();
        int arr[][] = new int[row][column];
        takeInput(arr, sc);
        wavePrint(arr);
        }

    // WAVES METHOD
    public static void wavePrint(int[][] mat){
        if(mat.length == 0){
			return;
		}
		int n = mat.length;
		for(int col = 0 ; col < mat[0].length ; col++){
			if(col % 2 != 0){

			for(int row =n-1  ; row>= 0 ; row--){
				System.out.print(mat[row][col]+" ");
			}

			}
			else{
				for(int row =0  ; row < n ; row++){
				System.out.print(mat[row][col]+" ");
			}
			}
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
