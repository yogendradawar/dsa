import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        //My thinking it is also write 
        // int i = 1;
        // int ans = 0;
        // while (i <= number / 2) {
        //     int count = i * i;
        //     if (count <= number) {
        //         ans = i;
        //     } else {
        //         break;
        //     }
        //     i++;
        // }
        // System.out.print(ans);

        int output = 0;
        while(output * output <= number){
            output += 1;
        }
        output -= 1;
        System.out.print(output);
    }
}
