package dsa.Introduction_To_Java.week_2.Conditionals_and_Loops_4;
import java.util.Scanner;

class fahrenheitToCelsiusTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Start Fahrenheit Value: ");
        int startFahrenheit = sc.nextInt();

        System.out.println("Enter the End Fahrenheit Value: ");
        int endFahrenheit = sc.nextInt();

        System.out.println("Enter the Step Size: ");
        int stepSize = sc.nextInt();


        while(0 <= startFahrenheit && startFahrenheit <= endFahrenheit){
        int celsiusValue = ((startFahrenheit - 32) * 5) / 9;

        System.out.println("startFahrenheit: " + startFahrenheit + " celsiusValue: " + celsiusValue);

        startFahrenheit = startFahrenheit + stepSize ;

        }

    }
}