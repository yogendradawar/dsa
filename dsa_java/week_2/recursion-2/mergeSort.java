import java.util.Scanner;

public class mergeSort {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arr number:");
        int num = sc.nextInt();
        int arr [] = new int [num];

        for(int i = 0  ; i < num ; i++){
            System.out.println("Enter the index"+i+" value:");
            arr[i] = sc.nextInt();
        }

        mergeSort(arr,0,arr.length-1);

        System.out.println("Sort order is: ");

        for(int i = 0 ; i < num ; i++){
            System.out.print(arr[i] +" ");
        }
    }

        public static void mergeSort(int [] arr, int l , int r) {
            if(l<r){

                int mid = (l + r) / 2;
    
                int sort1[] = new int [mid + 1];
                int sort2[] = new int [r - mid ];
    
                for(int i = 0 ; i < sort1.length ; i++){
                    sort1[i] = arr[i];
                }
    
                for(int i = 0 ; i < sort2.length ; i++){
                    sort2[i] = arr[mid+1+ i];
                }
    
                mergeSort(sort1, 0, sort1.length-1);
                mergeSort(sort2, 0, sort2.length-1);
    
                mergeSort(arr,sort1,sort2);
            }
            }
        

            public static void mergeSort(int arr[], int [] sort1 , int sort2[]){

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
        
                while(s2<sort2.length){
                    arr[a1] = sort2[s2];
                    s2++;
                    a1++;
                }
        
            }

}
