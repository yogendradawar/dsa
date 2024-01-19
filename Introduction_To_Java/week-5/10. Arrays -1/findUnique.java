import java.util.Scanner;

class findUnique{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = takeInput();
        int ans = unique(arr);
        // printArray(arr);
        System.out.println(ans);
    }



    //  Find Unique METHOD
    public static int unique(int[] arr) {
        int n = arr.length;

        // MY THOUGHT OF SOLVING

         //SEEN SOLUTION 

        for(int i = 0; i < n ; i++){
            int j ;
            for(j = 0 ; j < n ; j++){
                if(arr[i] == arr[j] && i != j){
                    break;
                }
            }
            if(j == n){
                return arr[i];
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