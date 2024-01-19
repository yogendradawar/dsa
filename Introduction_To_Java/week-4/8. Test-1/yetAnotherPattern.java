import java.util.Scanner;

public class yetAnotherPattern {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print Star: ");
        int num = sc.nextInt();
        int o = 1;
        while(o <= num){
        System.out.print("Enter the star: "+ o+ " value :");
        int number = sc.nextInt();
        
        int i = 1;
        while(i <= number){
            int j = 1;
            while(j < i){
                System.out.print(" ");
                j++;
            }
            int star =1;
            while(star <= number+1 -i){
                System.out.print("*");
                star++;
            }
            System.out.println();
            i++;
        }
        o++;
    }
}
}

