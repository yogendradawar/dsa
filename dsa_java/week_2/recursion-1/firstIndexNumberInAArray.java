import java.util.Scanner;

public class firstIndexNumberInAArray {
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
       
        return ansIndex(input,0,x);
    }


    public static int ansIndex(int [] input,int start, int x){

		if(start == input.length-1){
			return -1;
		}

		if(input[start] == x){
			return start;
		}

		return ansIndex(input, start+1, x);
	}
}
