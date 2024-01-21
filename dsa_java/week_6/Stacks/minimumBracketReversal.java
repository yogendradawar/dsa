package dsa.dsa_java.week_6.Stacks;

import java.util.Scanner;
// import java.util.Stack;

public class minimumBracketReversal {

    public static int countBracketReversals(String input) throws stackEmptyExceptions {
		//Your code goes here
			stackUsingLL<Character> stack = new stackUsingLL<>();
			if(input.length() % 2 != 0){
				return -1;
			}
			for(int i = 0 ; i < input.length(); i++){
				char ch = input.charAt(i);
				if(ch == '}'){
					if(stack.isEmpty()){
						stack.push(ch);
					}
					else if(stack.top() == ch){
						stack.push(ch);
					}
					else{
						stack.pop();
					}
				}
				else{
					if(ch == '{'){
						stack.push(ch);
					}
				}
			}

			int cnt = 0; 
			while(!stack.isEmpty()){
				char first = stack.pop();
				char second = stack.pop();
				if(first != second){
					cnt+= 2;
				}
				else{
					cnt+=1;
				}
			}

			return cnt;

	}
    public static void main(String[] args) throws stackEmptyExceptions {
        
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println(countBracketReversals(str));
        }
    }
