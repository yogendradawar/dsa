import java.util.Scanner;

public class leadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value :");
        int n = sc.nextInt();

        int arr[]  = new int[n];

        takeInput(arr, sc);

        // takeInput(arr, sc);
        leaders(arr);
        
        }

    // MIN LENGTH METHOD
    public static void leaders(int [] arr){
        for(int i = 0 ; i < arr.length -1 ; i++){
			int j = i + 1;
			for( ; j < arr.length ; j++){
					if(arr[i] < arr[j]){
						break;
					}
					if( j == arr.length - 1){
			System.out.print(arr[i] + " ");
			}
			}
			
		}

		System.out.print(arr[arr.length - 1]);
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
    public static void takeInput(int[]arr, Scanner sc) {

        for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter the "+ i + "th element");
                arr[i]= sc.nextInt();
        }
    }
}
