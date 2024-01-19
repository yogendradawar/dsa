import java.util.Scanner;

public class arrayEquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of 1 arr : ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        takeInput(arr1, n1, sc);

        System.out.println(arrayEquilibriumIndex(arr1));

    }

    public static void takeInput(int arr[], int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + "th element :");
            arr[i] = sc.nextInt();
        }
    }

    public static int arrayEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        int i = 0;
        int left = 0;
        while (i < arr.length - 1) {
            totalSum += arr[i];
            i++;
        }

        for (int j = 0; j < arr.length; j++) {
            int right = 0;
            right = totalSum - left - arr[j];
            if (left == right) {
                return j;
            } else {
                left += arr[j];
            }
        }
        return -1;
    }
}
