import java.util.Scanner;

public class tripletSum {
    public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);

        int arr[] = takeInput();

        System.out.print("Enter the target value : ");
        int target = sc.nextInt();

        int ans  = sum(arr, target);
        // printArray(arr);
        System.out.println(ans);
    }



    // TRIPLET   SUM METHOD
    public static int sum(int[] arr, int X) {

        // MY THOUGHT OF SOLVING
        int count = 0;
            for(int i = 0; i < arr.length-2 ; i++){
            for(int j = i+1 ; j < arr.length-1 ; j++){
                for(int k = j+1; k < arr.length ; k++){
                    if(arr[i] + arr[j] + arr[k]== X){
                    count++;
                }
                }
            }
        }
            return count;
         //SEEN SOLUTION 

        
        }
    

    // TAKE INPUT METHOD
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int arr = sc.nextInt();
        int arr1[] = new int[arr];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter element at " + i + "th index");
            arr1[i] = sc.nextInt();
        }
        return arr1;
    }

    // PRINT ARRAY METHOD
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
