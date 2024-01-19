import java.util.Scanner;

public class pairSum {
     public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);

        int arr[] = takeInput();

        System.out.print("Enter the target value : ");
        int target = sc.nextInt();

        int ans  = sum(arr, target);
        // printArray(arr);
        System.out.println(ans);
    }



    // PAIR SUM METHOD
    public static int sum(int[] arr, int target) {

        // MY THOUGHT OF SOLVING
        int count = 0;
            for(int i = 0; i < arr.length-1 ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    count++;
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
