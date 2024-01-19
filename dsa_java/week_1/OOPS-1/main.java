import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int degree1[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the degree1 element " + i );
            degree1[i] = sc.nextInt();
        }

        int coeff1[] = new int[n];

        for(int i = 0 ; i <n ; i++){
            System.out.print("Enter the coeff1 element " + i );
            coeff1[i] = sc.nextInt();
        }

        Polynomial first = new Polynomial();

        for(int  i = 0 ; i < n ; i++){
            first.setCoefficient(degree1[i], coeff1[i]);
        }

        n = sc.nextInt();

        int degree2 []  = new int[n];

        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the degree2 element " + i );
            degree2[i] = sc.nextInt();
        }

        int coeff2[] = new int[n];

        for(int i = 0; i< n ; i++){
            System.out.print("Enter the coeff2 element " + i );
            coeff2[i] = sc.nextInt();

        }


        Polynomial second = new Polynomial();

        for(int i = 0; i< n ; i++){
            second.setCoefficient(degree2[i], coeff2[i]);
        }

        int choice = sc.nextInt();

        Polynomial result;

        switch(choice){

            case 1:
            result = first.add(second);
            result.print();
            break;


            case 2:
            result = first.subtract(second);
            result.print();
            break;

            case 3:
            result = first.multiply(second);
            result.print();
            break;
        }
    }
}
