import java.util.Scanner; 
 class returnArraySum {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int arr[] = takeInput();
    System.out.print(sum(arr));
        }


    public static int sum (int [] arr){
        int sum = 0;
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            sum += arr[i];
        }
        return sum;
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