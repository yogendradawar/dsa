import java.util.Scanner;

public class termsOfAp {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = sc.nextInt();
        int count  = 1;
        for(int i= 1; i <= number; i++){
            int ap  = 3 * count  + 2;
            if(ap % 4 == 0){
                i--;
            }
            else{
                System.out.println(ap +" ");

            }
            count++;
            
        }
}
}
