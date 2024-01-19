package dsa.Introduction_To_Java.Week_1.Flow_Chart_1;

    import java.util.Scanner;
class checkPrimeNumber{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a prime number");

        int number = sc.nextInt();

        boolean isPrime = true;
        for(int i = 2 ; i< number; i++){
            if(number == 2){
                break;
            }
            if(number % i == 0 ){
                isPrime = false;
            break;
            }
        }
        if(isPrime){
            System.out.println(number + " is a prime number");
        }
        else{
            System.out.println(number + " is not a prime number");
        }
    }
}
