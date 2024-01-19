import java.util.Scanner;
class splitArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        takeInput(arr,sc);

        System.out.print(splitArray(arr));
    } 

    public static void takeInput(int []arr,Scanner sc){
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static boolean splitArray(int []arr){
        return check(arr,0,0,0);
    }

    public static boolean check(int arr[] , int start , int g1, int g2){

        if(start == arr.length){
            return g1==g2;
        }
        if(arr[start] % 5 == 0){
            g1+= arr[start];
        }
        else if(arr[start] % 3 ==0){
            g2+= arr[start];
        }
        else{
            boolean left  = check(arr, start+1, g1+arr[start], g2);
            boolean right = check(arr, start+1, g1, g2+arr[start]);

            return left || right;
                }
        return check(arr, start+1,g1, g2);
    }
}