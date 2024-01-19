package dsa.Introduction_To_Java.Week_1.Getting_Started_with_Java_2;
import java.util.Scanner;
public class rectangularArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first coordinates values: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter the second coordinates values: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int areaOfRectangle = (x2-x1) * (y2-y1);
        System.out.println("Area of Rectangle : "+areaOfRectangle);
    }
}
