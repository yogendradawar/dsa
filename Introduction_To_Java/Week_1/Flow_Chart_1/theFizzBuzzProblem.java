package dsa.Introduction_To_Java.Week_1.Flow_Chart_1;
// import java.util.Scanner;

class theFizzBuzzProblem{
    public static void main (String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number :");
        // int n = sc.nextInt();

        for(int i = 1; i <= 100; i++ ){
           if(i%3 == 0 && i % 5 ==0){
                System.out.println("FizzBuzz");
            }

            else if(i>4 && i%5 == 0){
                System.out.println("Buzz");
            }
            else  if( i>2 &&i % 3 == 0){
            System.out.println("Fizz");
           }
            else{
            System.out.println(i);
            }
        }
    }
}