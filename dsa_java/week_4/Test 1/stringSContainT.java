import java.util.Scanner;

public class stringSContainT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(checkSequence(s1,s2));
    }

    public static boolean checkSequence(String a, String b){
        if(a.length()==0){
            return false;
        }

        if(b.length() == 0){
            return true;
        }

        if(a.charAt(0) == b.charAt(0)){
            return checkSequence(a.substring(1), b.substring(1));
        }
        else{
            return checkSequence(a.substring(1), b);
        }
    }
}
