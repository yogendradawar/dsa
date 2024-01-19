import java.util.Scanner;

public class printFirstnNaturalNumbers {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit :");
        int num = sc.nextInt();

         print(num);
    }

    public static void print(int num) {
        if(num == 0){
            return ;
        }

        print(num -1);
        System.out.print(num + " ");
    }
}
