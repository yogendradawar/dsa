import java.util.Scanner;

public class sumOfTwoArrays {
     public static void main(String[] args) {
        
        
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter arr1 :");
        int arr1[] = takeInput();

    System.out.println("Enter arr2 :");
        int arr2[] = takeInput();



        int output[] = new int [Math.max(arr1.length, arr2.length)+1];

        sumOfTwoArrays(arr1, arr2, output);
        printArray(output);
        // System.out.println(ans);
    }

    //  ARRAY ROTATION CHECK METHOD

    public static void sumOfTwoArrays(int[] arr1, int []arr2 , int output[]) {

        // MY THOUGHT OF SOLVING

        int n = arr1.length - 1;
        int m = arr2.length - 1;
        int k = Math.max(arr1.length , arr2.length);
        int carray = 0 ;
        while(n >=0 && m>=0){

            int sum = arr1[n]+arr2[m]+carray;
            output[k] = sum % 10;
            carray = sum / 10;

            n--;
            m--;
            k--;
        }

         while(n >=0){

            int sum = arr1[n]+carray;
            output[k] =sum % 10 ;
            carray = sum / 10;

            n--;
            k--;
        }


         while(m >=0){

            int sum = arr2[m]+carray;
            output[k] = sum % 10;
            carray = sum / 10;

            m--;
            k--;
        }

        output[0] = carray;


        
        // SEEN SOLUTION

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
