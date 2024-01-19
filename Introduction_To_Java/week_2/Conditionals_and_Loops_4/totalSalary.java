package dsa.Introduction_To_Java.week_2.Conditionals_and_Loops_4;
import java.util.Scanner;
class totalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the basic salary: ");
        int basicSalary = sc.nextInt();

        System.out.println("Enter any grade (an uppercase character): ");
        char grade = sc.next() .charAt(0);

        double hra = basicSalary * 0.5;
        double da =  basicSalary * 0.2;
        int allow;

        if(grade == 'A'){
            allow = 1700;
        }
        else if(grade == 'B'){
            allow = 1500;
        }
        else {
            allow = 1300;
        }

        double pf = basicSalary * .11;

        double totalSalary = basicSalary + hra + da + allow - pf;

        int ans = (int) Math.round(totalSalary);
        System.out.println("Total salary we get "+ ans);
    }
}