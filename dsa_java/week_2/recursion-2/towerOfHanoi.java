import java.util.Scanner;
public class towerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n,'a','b','c');
    }

    public static void towerOfHanoi(int disk,char source, char auxiliary,char destination) {
        if(disk == 0){
            return;
        }
            if(disk == 1){
                System.out.println(source + " " + destination );
            }

            towerOfHanoi(disk-1, source, destination, auxiliary);
            System.out.println(source + " " + destination);
            towerOfHanoi(disk-1, auxiliary, source, destination);
    }
}
