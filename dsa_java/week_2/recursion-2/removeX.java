import java.util.Scanner;
public class removeX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.next();

         System.out.println("Words without x are : "+ removeX(str));
    }

        public static String removeX(String str){

            if(str.length() == 0){
                return "";
            }

            if(str.charAt(0) == 'x'){
                return removeX(str.substring(1));
            }
            else{

                return str.charAt(0) + removeX(str.substring(1));
            }
        }
    
    }
