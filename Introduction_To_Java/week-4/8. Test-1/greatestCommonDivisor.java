import java.util.Scanner;
public class greatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value ");
        int value = sc.nextInt();
        // MY solution it is also correct 
        // while(value >=1 ){
        //     int num1 = sc.nextInt();
        //     int num2 = sc.nextInt();
        //     int result = 0;

        //     for(int i = 1; i <= num2; i++){
        //         if(num1 % i == 0 && num2 % i == 0){
        //             result = Math.max(result, i);
        //         }
        //     }
        //     value--;
        //     System.out.print(result);
        //     System.out.println();
            
        // }

            // Seen solution from somewhere else...

            while(value >= 1){

				int num1 = sc.nextInt();
				int num2 =sc.nextInt();
				int temp = 0;
				int GCD;
				while (num2 != 0){
					temp = num2;
					num2 = num1 % num2;
					num1 = temp;
				}
				GCD = num1;
				System.out.print(GCD);
				value --;
				System.out.println();
			}
    }
}
