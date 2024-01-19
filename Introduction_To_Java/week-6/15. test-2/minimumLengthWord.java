import java.util.Scanner;

public class minimumLengthWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the row");
        // int row = sc.nextInt();
        // System.out.println("Enter the column");
        // int column = sc.nextInt();
        // int arr[][] = new int[row][column];
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        // takeInput(arr, sc);
           System.out.println(minimumLengthWord(str)); 
        }

    // MIN LENGTH METHOD
    public static String minimumLengthWord(String input){
        int min = Integer.MAX_VALUE;
		String ans = "";
		int count = 0;
		int end = 0;
		int start = 0;


		for(int i = 0 ; i < input.length() ; i++){
			char ch = input.charAt(i);
			if(ch == ' '){
				end = i;
				if(count < min){
					min = count;
					ans = input.substring(start,end);
				}
				count = 0;
				start = i +1;
			}
			else{
			count++;
			}
		}

		if(count < min){
			min = count;
			ans = input.substring(start, input.length());
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
