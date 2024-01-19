import java.util.Scanner;
public class fahrenheitToCelsius{
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Start Fahrenheit Value: ");
        int startFah = sc.nextInt();

        System.out.println("Enter the End Fahrenheit Value: ");
        int endFah = sc.nextInt();

        System.out.println("Enter the step value: ");
        int step = sc.nextInt();

            calculateValue(startFah, endFah, step);
			}


public static void calculateValue(int first , int end , int step ){
    //     for(int i = first; i <= end; i +=step){
    //         int cel = 5 * (i  - 32) /9;
    //         System.out.print(i +" "+ cel);
    //         System.out.println();
    // }
        int currentValue = first;
    while(currentValue <= end){
        int cel = 5 * (currentValue  - 32) /9;
        System.out.print(currentValue +" "+ cel);
        System.out.println();
        currentValue += step;
}
}
}