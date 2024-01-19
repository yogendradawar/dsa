import java.util.Scanner;

public class extraCandies {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arr person 1 ");
        int arr1[] = takeInput();
        System.out.println("Enter arr person 2 ");
        int arr2[] = takeInput();

        System.out.println("Enter Intger X: ");
        int x = sc.nextInt();

        extraCandies(arr1.length,x,arr1,arr2);
        printArray(arr1);
        // System.out.println(ans);
    }

    // EXTRA CANDIES METHOD

    public static void extraCandies(int n,int x, int []p1, int []p2) {

        // MY THOUGHT OF SOLVING

        int carry = 0;
        for(int i = 0 ; i < n ; i++){
            int sum = p1[i] + p2[i] + carry;

            if(sum > x){
                p1[i] = x;
                carry = sum - x;
            }
            else{
                p1[i] = sum;
                carry = 0;
            }
        }
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
