import java.util.Scanner;

public class lastIndexNumberInAArray {
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

         System.out.println("The index : "+ firstIndex(arr,check));
    }

    public static int firstIndex(int []input,int x) {
       
        return ansIndex(input,input.length-1,x);
    }


    public static int ansIndex(int [] input,int end, int x){

		if(end == -1){
			return -1;
		}

		if(input[end] == x){
			return end;
		}

		return ansIndex(input, end-1, x);
	}
}
