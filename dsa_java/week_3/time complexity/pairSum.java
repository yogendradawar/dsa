import java.util.Scanner;
import java.util.Arrays;

public class pairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of 1 arr : ");
        int n1 = sc.nextInt();
        int arr[] = new int[n1];
        takeInput(n1,arr,sc);

        System.out.println("Enter value of pair sum:");
        int pair = sc.nextInt();

        System.out.println(tripletSum(arr ,pair));
    }
    public static int tripletSum(int arr[] , int num){
        Arrays.sort(arr);
        int numTriplets = 0 ;
        int n = arr.length;
        for(int i = 0 ; i < arr.length ; i++){
            int pairSumFor = num - arr[i];
            int numPair = pairSum(arr, i+1  , n-1, pairSumFor);
            numTriplets += numPair;
        }
        return numTriplets;
    }
    public  static int pairSum(int arr[] , int startIndex , int endIndex , int num){
        // Arrays.sort(arr);
        // int startIndex = 0 ;
        // int endIndex = arr.length - 1;
        int sumOfPair = 0;

        while(startIndex < endIndex){
            if(arr[startIndex] + arr[endIndex] < num){
                startIndex++;
            }
            else if(arr[endIndex] + arr[startIndex] > num){
                endIndex--;
            }
            else{
                int elementInStartIndex = arr[startIndex];
                int elementInEndIndex = arr[endIndex];

                if(elementInStartIndex == elementInEndIndex){
                    int indexSum = (endIndex - startIndex) +1;
                    sumOfPair+=(indexSum *(indexSum - 1)) / 2;
                    return sumOfPair;
                }

                int tempStartIndex = startIndex + 1;
                int tempEndIndex = endIndex - 1;

                while(tempStartIndex <= endIndex && arr[tempStartIndex] == elementInStartIndex){
                    tempStartIndex++;
                } 

                while (tempEndIndex >= startIndex && arr[tempEndIndex] == elementInEndIndex) {
                    tempEndIndex--;
                }

                int totalOfStart = tempStartIndex - startIndex;
                int totalOfEnd = tempEndIndex - endIndex;

                sumOfPair +=totalOfStart * totalOfEnd;
                startIndex = tempStartIndex;
                endIndex  = tempEndIndex;
            }
        }
        return sumOfPair;
    }

    public static void takeInput(int n,int [] arr,Scanner sc){
        for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
        }
    }
}
