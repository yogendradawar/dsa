import java.util.Scanner;

class runner{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int real1 = sc.nextInt();
        int imaginary1 = sc.nextInt();

        int real2 = sc.nextInt();
        int imaginary2 = sc.nextInt();

        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

        int choice = sc.nextInt();

        if(choice == 1){
            c1.plus(c2);
            c1.print();
        }
        else if (choice == 2){
            c1.multiply(c2);
            c1.print();
        }
        else{
            return ;
        }
    
    }
}