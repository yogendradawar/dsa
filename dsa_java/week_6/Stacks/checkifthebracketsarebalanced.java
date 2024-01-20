package dsa.dsa_java.week_6.Stacks;
import java.util.Scanner;

public class checkifthebracketsarebalanced {

    public static boolean isBalanced(String str) throws stackEmptyExceptions{
        stackUsingLL <Character> stack = new stackUsingLL<>();

        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == '('){
                stack.push(str.charAt(i));
            }
            else if(!stack.isEmpty() && str.charAt(i) == ')'){
                if(stack.top() == '('){
                    stack.pop();
                }
                else{
                    return false;
                }


            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) throws stackEmptyExceptions {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
