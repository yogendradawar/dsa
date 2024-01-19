import java.util.Scanner;

public class quickSort {
    static Scanner s = new Scanner(System.in);

    public static int[] takeInput(){
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        quickSort(input, 0, input.length - 1);
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }

	
	public static void quickSort(int[] input,int startIndex, int endIndex) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		 if(startIndex >= endIndex){
			 return ;
		 }
		int pivot = quickSortSolved(input,startIndex,endIndex);
		quickSort(input,startIndex,pivot-1);
		quickSort(input,pivot+1,endIndex);
	}

	public static int quickSortSolved(int input[] , int start , int end){

		int pivot = input[start];
		int count = 0;

		for(int i = start + 1 ; i <= end ; i++){
			if(input[i] <= pivot){
				count++;
			}
		}
		int pivotIndex = start + count;
		int temp  = input[start] ;
		input[start] = input[pivotIndex];
		input[pivotIndex] = temp;


		int i = start;
		int j = end ; 

		while( i <= pivotIndex &&  j >= pivotIndex){
				while( i <= pivotIndex && input[i] <= pivot){
					i++;
				}

				while(j >= pivotIndex && input[j] > pivot){
					j--;
				}

				if(i< pivotIndex && j > pivotIndex){
					 temp = input[i];
					input[i] = input[j];
					input[j] = temp;
					i++;
					j--;
				}
		}
		return pivotIndex;
	}
	
}
    