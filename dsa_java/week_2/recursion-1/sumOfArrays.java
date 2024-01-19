import java.util.Scanner;

public class sumOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        int arr[] = new int[num];

        for(int i = 0 ; i < arr.length ; i++) { 
            System.out.println("Enter the "+ i+ " term :");
            arr[i] = sc.nextInt();
        }

         System.out.println("The sum of Number is: " + sum(arr));
    }

    public static int sum(int []input) {
       // 1 APPROACH 

    //    if(input.length == 0){
	// 			return 0;
	// 		}

	// 		int ans [] = new int[input.length-1];

	// 		for(int i = 0 ; i < ans.length ; i++){
	// 			ans[i] = input[i];
	// 		}

	// 		int sum = input[input.length - 1] + sum(ans);

	// 		return sum;


    return ansSum(input, input.length );
    }

    //APPROACH 2------------------------------------------------

    public static int ansSum(int [] input , int n){
		if(n == 0){
			return 0;
		}

		int sum = input[n-1] + ansSum(input, n-1);

		return sum;
	}
}
