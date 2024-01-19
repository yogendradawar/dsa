package dsa.dsa_java.week_6.Stacks;
class StackUsingArray{
        private int data[];
        private int top ;

        public StackUsingArray(){
           data = new int[10];
           top = -1; 
        }
        
        public StackUsingArray(int capacity){
            data = new int[capacity];
            top = -1;
        }

        public boolean isEmpty(){
            return (top == -1);
        }

        public int size(){
            return top+1;
        }

        public int top() throws stackEmptyExceptions{
            if(size() == 0){
                stackEmptyExceptions e = new stackEmptyExceptions();
                throw e;
            }
            return data[top];
        }

        public void push(int element) throws stackFullExceptions{
            if(size() == data.length){
                // stackFullExceptions e = new stackFullExceptions();
                // throw e;

                doubleCapacity();
            }
            top++;
            data[top] = element; 
        }

        public void doubleCapacity(){
            int temp[] = data;
            data = new int[2 * temp.length];

            for(int i = 0 ; i <= top ; i++){
                data[i] = temp[i];
            }
        }

        public int pop() throws stackEmptyExceptions{

            if(size() == 0){
                stackEmptyExceptions e = new stackEmptyExceptions();
                throw e;
            }

            int temp = data[top];
            top--;

            return temp;
        }
    }
