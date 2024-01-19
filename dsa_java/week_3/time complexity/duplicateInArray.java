import java.util.Scanner;

public class duplicateInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of 1 arr : ");
        int n1 = sc.nextInt();
        int arr[] = new int[n1];
        takeInput(n1,arr,sc);
        System.out.println(findDuplicate(arr));
    }

    public  static int findDuplicate(int arr[]){
            int ans = 0 ;
            for(int i = 0  ; i< arr.length ; i++){
                ans += arr[i];
            }

            int n = arr.length;
            int sum = ((n-2)*(n-1)) / 2;
            ans = ans - sum;

            return ans; 
    }

    public static void takeInput(int n,int [] arr,Scanner sc){
        for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
        }
    }
}
