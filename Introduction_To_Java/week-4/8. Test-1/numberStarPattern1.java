import java.util.Scanner;

class numberStarPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int i = 1;
        while(i <= number){
            int j = number;
            while(j >= 1){
                if( i == j){
                    System.out.print("*");
                }
                else{
                    System.out.print(j);
                }
                j--;
            }
            System.out.println();
            i++;
        }
    }
}