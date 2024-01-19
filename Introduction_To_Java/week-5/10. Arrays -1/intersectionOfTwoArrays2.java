import java.util.Scanner;

public class intersectionOfTwoArrays2 {
     public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
     System.out.println("put arr1: ");
        int arr1[] = takeInput();
        System.out.println("put arr2: ");
        int arr2[] = takeInput();
        interTwoArray(arr1 ,arr2);
        // printArray(arr);
        // System.out.println(ans);
    }



    // INTERSECTION OF TWO ARRAYS METHOD
    public static void interTwoArray(int[] arr1, int []arr2) {

        // MY THOUGHT OF SOLVING
            for(int i = 0; i < arr1.length ; i++){
            for(int j = 0 ; j < arr2.length ; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[j] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;

                }
            }
        }

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
