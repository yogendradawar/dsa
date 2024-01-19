import java.util.Scanner;
class reverseOfANumber{
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int ans = 0;
        while(number > 0){
            ans = ans * 10 + number % 10;
            number = number / 10;
        }
        System.out.print(ans);
    }
}