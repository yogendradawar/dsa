package dsa.dsa_java.week_6.Stacks;
public class stackUse {
    public static void main(String[] args) throws stackFullExceptions {
        StackUsingArray stack = new StackUsingArray(3);
        for(int i = 0 ; i <= 5 ; i++){
            stack.push(i);
        }

        while(!stack.isEmpty()){
            try {
                System.out.println(stack.pop()); 
            } catch (stackEmptyExceptions e) {
                // TODO Auto-generated catch block
                // NEVER REACHs
            }
        }
    }
}
