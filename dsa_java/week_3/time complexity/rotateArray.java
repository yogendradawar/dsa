import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of 1 arr : ");
        int n1 = sc.nextInt();
        int arr[] = new int[n1];
        takeInput(n1,arr,sc);

        System.out.println("Enter value of left rotated:");
        int pair = sc.nextInt();

        rotate(arr, pair);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotate(int arr[] , int d){
        if(arr.length == 0){
            return;
        }

        if( d > arr.length && arr.length != 0){
            d %= arr.length;
        }

        rotateLeft(arr, 0, d-1);
        rotateLeft(arr, d, arr.length-1);
        rotateLeft(arr , 0 , arr.length-1);
    }

    public static void rotateLeft(int []arr , int left , int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void takeInput(int n,int [] arr,Scanner sc){
        for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
        }
    }
}
