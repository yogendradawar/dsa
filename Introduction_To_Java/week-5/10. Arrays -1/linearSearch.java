import java.util.Scanner;

public class linearSearch {
     public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int arr[] = takeInput();
    System.out.println("Enter the value X: ");
    int x = sc.nextInt();
    System.out.print(linearSear(arr , x));
        }


    public static int linearSear (int [] arr, int x){
        // int ans = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }


    public static int[] takeInput(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int arr = sc.nextInt();
        int arr1 [] = new int[arr];
        for(int i = 0 ; i < arr1.length ; i++){
            System.out.println("Enter element at "+ i + "th index");
            arr1[i] = sc.nextInt();
        }
        return arr1;
 }
}
