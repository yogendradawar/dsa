import java.util.Scanner;
import java.util.Arrays;

public class arrayInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of 1 arr : ");
        int n1 = sc.nextInt();
        int arr1 [] = new int [n1];
        takeInput(arr1, n1, sc);

        System.out.println("Enter the value of 1 arr : ");
        int n2 = sc.nextInt();
        int arr2 [] = new int [n2];
        takeInput(arr2, n2, sc);

        intersection(arr1, arr2);

    }

    public  static void takeInput(int arr[],int n , Scanner sc ){
        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter the " + i + "th element :");
            arr[i] = sc.nextInt();
        }
    }

    public static void intersection (int [] arr1, int [] arr2){

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            int i = 0 ; 
            int j = 0 ;

            while(i < arr1.length && j < arr2. length){
                if(arr1[i] < arr2[j]){
                    i++;
                }
                else if(arr2[j] <  arr1[i] ){
                    j++;
                }
                else{
                    System.out.print(arr1[i]+" ");
                    i++;
                    j++;
                }
            }
    }
}
