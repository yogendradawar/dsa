package dsa.dsa_java.week_6.Stacks;

import java.util.Scanner;
// import java.util.Stack;

public class stockSpan {

    public static int[] stockSpan(int[] price) throws stackEmptyExceptions {
		//Your code goes here
		stackUsingLL <Integer> stack = new stackUsingLL<>();
		int [] ans = new int[price.length];
		stack.push(0);
		ans[0] = 1;
		
		for(int i = 1 ; i < price.length ;i++ ){

			while(!stack.isEmpty() && price[stack.top()] < price[i]){
				stack.pop();
			}

			if(stack.isEmpty()){
				ans [i] = i + 1;
			}
			else{
				ans[i] = i - stack.top();
			}
			stack.push(i);
		}
		return ans;
	}
    public static void main(String[] args) throws stackEmptyExceptions {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int input[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            input[i] = sc.nextInt();
        }

        int result [] = stockSpan(input);

        for(int i = 0 ; i < result.length ; i++){
            System.out.print(result[i] + " ");
        }
    }
}
