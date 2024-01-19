import java.util.Scanner;

public class countSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arr 1: ");
        int arr1[] = takeInput();
        System.out.println("enter arr 2: ");
        int arr2[] = takeInput();
        int[] ans = small(arr1, arr2, arr1.length, arr2.length);
        printArray(ans);
        // System.out.println(ans);
    }

    // COUNT SMALL METHOD

    public static int[] small(int[] a, int[] b, int n, int m) {

        // MY THOUGHT OF SOLVING

        // for (int i = 0; i < a.length; i++) {
        // int count = 0;
        // for (int j = 0; j < b.length; j++) {
        // if (b[j] <= a[i]) {
        // count += 1;
        // }
        // }
        // a[i] = count;
        // }
        // return a;

        // SEEN SOLUTION

        for (int i = 1; i < m; i++) {
            int j = i - 1;
            int temp = b[i];
            while (j >= 0 && b[j] > temp) {
                b[j + 1] = b[j];
                j--;
            }
            b[j + 1] = temp;
        }

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = m - 1;
            int count = 0;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (b[mid] <= a[i]) {
                    count = mid + 1;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            a[i] = count;
        }
        return a;

    }

    // SWAP METHOD

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // TAKE INPUT METHOD
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int arr = sc.nextInt();
        int arr1[] = new int[arr];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter element at " + i + "th index");
            arr1[i] = sc.nextInt();
        }
        return arr1;
    }

    // PRINT ARRAY METHOD
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
