import java.util.Scanner;

public class arrangeNumbersInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int arr[] = takeInput();

        System.out.println("Enter the value: ");
        int value = sc.nextInt();
        // int ans [] = numberArrange(value);

        int ans[] = new int[value];
        numberArrange(ans, ans.length);
        print(ans);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void numberArrange(int[] arr, int num) {
        // TRYING TO SOLVE BY MY METHOD..
        // // int ans = 0;
        // int value = 1;
        // int arr [] = new int [num];
        // for(int i = 0 ; i <= num/2 ; i++){
        // arr[i] = value;
        // value += 2;
        // }

        // value = num -1;
        // for( int j = (num/2) +1 ; j < num ; j++){
        // arr[j] = value;
        // value -= 2;
        // }
        // return arr;

        // MY CORRECT CODE SNIPPET
        // int pointer1 = 0;
        // int pointer2 =num - 1;
        // // int arr [] = new int [num];
        // int element = 1;

        // while(pointer1 < pointer2){
        // arr[pointer1++] = element++;
        // arr[pointer2--] = element++;

        // if(pointer1 == pointer2){
        // arr[pointer1] = element;
        // }
        // }

        // SEEN SOLUTION CODE
        // SOLUTION CODE

        int left = 0;
        int right = num - 1;
        int element = 1;

        while (left <= right) {
            if (element % 2 == 1) {
                arr[left] = element;
                left++;
                element += 1;
            } else {
                arr[right] = element;
                right--;
                element += 1;
            }
        }
    }
}
