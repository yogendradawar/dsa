import java.util.Scanner;

public class findDuplicate {
    public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
        int arr[] = takeInput();
        int ans = duplicate(arr);
        // printArray(arr);
        System.out.println(ans);
    }



    // FIND DUPLICATE METHOD
    public static int duplicate(int[] arr) {
        int n = arr.length;

        // MY THOUGHT OF SOLVING

         //SEEN SOLUTION 

        for(int i = 0; i < n-1 ; i++){
            for(int j = i+1 ; j < n ; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return Integer.MIN_VALUE;
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
