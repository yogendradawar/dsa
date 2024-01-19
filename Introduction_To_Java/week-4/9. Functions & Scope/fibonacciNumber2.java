import java.util.Scanner;
class fibonacciNumber2{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the fibonacci number: ");
        int number = sc.nextInt();

        boolean result = checkNumber(number);
        System.out.print(result);
    }

    public static boolean checkNumber(int num){
        // int a = 0;
        // int b = 1;
        // int c = 0;
        // boolean result = true;
        // for(int i = 0 ; i < num ; i++){
        //     c = a + b;
        //     a = b;
        //     b = c;
        //     if(c == num){
        //         result = true;
        //         return result ;
        //     }
        //     else {
        //         result = false;
        //     }
        // }
        // return result;

        //SEEN ANS

			int a = 0;
			int b = 1;
			int c = 0;

			while(a < num){
				c = a+ b;
				a = b; 
				b = c;
			}

			if(a == num){
				return true;
			}	
			else{
				return false;
			}
    }
}
