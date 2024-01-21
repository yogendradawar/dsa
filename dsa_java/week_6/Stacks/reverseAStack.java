package dsa.dsa_java.week_6.Stacks;

import java.util.Scanner;

class reverseAStack{

    public static void reverseStack(stackUsingLL<Integer>input , stackUsingLL<Integer> extra) throws stackEmptyExceptions{
        while(!input.isEmpty()){
			extra.push(input.pop());
		}
		while(!extra.isEmpty()){
			System.out.print(extra.pop() + " ");
		}
	}
    public static void main(String[] args) throws stackEmptyExceptions {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        stackUsingLL<Integer> input = new stackUsingLL<>();
        for(int i = 0 ; i < n ; i++){
            // int ele = sc.nextInt();
            input.push(sc.nextInt());
        }

        stackUsingLL <Integer> extra = new stackUsingLL<>();

        reverseStack(input,extra);
    }
}