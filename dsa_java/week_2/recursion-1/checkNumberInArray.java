import java.util.Scanner;

public class checkNumberInArray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        int arr[] = new int[num];

        for(int i = 0 ; i < arr.length ; i++) { 
            System.out.println("Enter the "+ i+ " term :");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number for check :");
        int check = sc.nextInt();

         System.out.println(checkNumber(arr,check));
    }

    public static boolean checkNumber(int []input,int x) {
       // 1 APPROACH 

   	// if(input.length == 0){
		// 	return false;
		// }

		// int ans[] = new int [input.length-1];

		// for(int i = 0  ; i < ans.length ; i++){
		// 	ans[i] = input[i];
		// }

		// if(input[input.length - 1] == x){
		// 	return true;
		// }
		
		// return checkNumber(ans , x);


        return ans(input,input.length,x);
    }

    //APPROACH 2------------------------------------------------

    public static boolean ans(int input[] , int n , int x){
		if(n==0){
			return false;
		}

		if(input[n-1] == x){
			return true;
		}
		return ans(input, n-1, x);
	}
}
