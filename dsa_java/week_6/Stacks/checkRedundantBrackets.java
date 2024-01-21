package dsa.dsa_java.week_6.Stacks;

import java.util.Scanner;

public class checkRedundantBrackets {

    public static boolean checkRedundantBrackets(String expression ) throws stackEmptyExceptions{
        stackUsingLL <Character> stack = new stackUsingLL<>();

        for(int i = 0 ; i < expression.length(); i++){
            char ch = expression.charAt(i);
            if(ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/' ){
                stack.push(ch);
            }
            else if (ch == ')'){
                boolean ans = false;
                while(!stack.isEmpty() && stack.pop() != '('){
                    stack.pop();
                    ans = true;
                }

                if(!ans){
                    return true;
                }

                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
        }

        return false;
        
    }
    public static void main(String[] args) throws stackEmptyExceptions {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.print( checkRedundantBrackets(input));
    }
}
