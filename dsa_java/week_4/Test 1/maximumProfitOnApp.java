import java.util.Scanner;

public class maximumProfitOnApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        takeInput(arr,sc);
        System.out.print(maximumProfit(arr));
    }

    public static void takeInput(int [] arr,Scanner sc){
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static int maximumProfit(int []arr){
        mergerSort(arr,0,arr.length-1);

        int ans[] = new int[arr.length];
        for(int i = 0 ; i<arr.length ; i++){
            ans[i] = arr[i] * (arr.length - i);
        }
        int max = Integer.MIN_VALUE;
        for(int i : ans){
            if(i > max){
                max = i;
            }
        }

        return max;
    }

    public static void mergerSort(int arr[] , int left , int right){
        if(left < right){
            int mid = (left + right) / 2;

            int sort1[] = new int [mid - left + 1];
            int sort2[] = new int [right - mid];

            for(int i = 0 ; i < sort1.length ; i++){
                sort1[i] = arr[left + i];
            }

            for(int i = 0 ; i < sort2.length ; i++){
                sort2[i] = arr[mid + 1 + i];
            }

            mergerSort(sort1, left, sort1.length-1);
            mergerSort(sort2, left, sort2.length-1);

            mergerSorted(arr,sort1,sort2);
        }
    }

        public static void mergerSorted(int [] arr, int sort1[], int [] sort2){
            int s1 = 0;
            int s2 = 0;
            int a1 = 0;

            while(s1 < sort1.length && s2 < sort2.length){
                if(sort1[s1] <= sort2[s2]){
                    arr[a1] = sort1[s1];
                    s1++;
                }
                else{
                    arr[a1] = sort2[s2];
                    s2++;
                }
                a1++;
            }

            while(s1 < sort1.length){
                arr[a1] = sort1[s1];
                s1++;
                a1++;
            }

            while(s2 < sort2.length){
                arr[a1] = sort2.length;
                s2++;
                a1++;
            }
        }
    }

