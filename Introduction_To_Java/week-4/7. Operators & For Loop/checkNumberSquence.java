import java.util.Scanner;

public class checkNumberSquence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number input value: ");
        int input = sc.nextInt();
        System.out.println("Enter the number :");
        int prev = sc.nextInt();
        int count  = 2;
        int current ;
        boolean isDec = true;
        while(count <= input) {
            current = sc.nextInt();
            count++;
             if(current == prev) {
                System.out.println("false");
                return;
            }
            if(current < prev){
                if(!isDec){
                    System.out.print("false");
                    return;
                }
            }

            else{
                if(isDec){
                    isDec = false;
                }
            }

            prev = current;
}

System.out.println("true");
}
}
