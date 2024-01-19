import java.util.Scanner;

public class largestRowAndColumn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row");
        int row = sc.nextInt();

        System.out.println("Enter the column");
        int column = sc.nextInt();

        int arr[][] = new int[row][column];

        takeInput(arr, sc);
        findLargest(arr);
     
    }

    // LARGEST METHOD
    public static void findLargest(int[][] mat) {
        int num = 0;
		int max = Integer.MIN_VALUE;
		boolean isRow = true; 

		if(mat.length == 0){
			System.out.print("row "+ num+" "+max);
			return ;
		}



		for(int i = 0 ; i < mat.length ; i++){
			int count = 0 ;
			for(int  j = 0 ; j < mat[0].length ; j++){
				count += mat[i][j];
			}
			if(count > max){
				max = count;
				num = i ;
			}
		}


		for(int i = 0 ; i < mat[0].length ; i++){
			int count1 = 0;
			for(int j =0 ; j < mat.length ; j++){
				count1 += mat[j][i];
			}

			if(count1 > max){
				max = count1;
				isRow = false;
				num = i;
			}
		}



		if(isRow){
            System.out.print("row " +  num+" "+max);
		}
		else{
			System.out.print("column " + num+" "+max);
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
