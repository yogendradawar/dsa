package dsa.dsa_java.week_6.Stacks;

class stackUsingLL<T>{
    private Node<T> head;
    private int size;

    public stackUsingLL(){
        head = null;
        size = 0;
    }

    int size(){
        return size;
    }

    T top() throws stackEmptyExceptions{
        if(size() == 0){
            throw new stackEmptyExceptions();
        }
        return head.data; 
    }

     boolean isEmpty(){
        return (head == null);
     }

     void push(T element){
        Node<T> newNode = new Node<T>(element);
        newNode.next = head;
        head = newNode;
        size++;
     }

     T pop() throws stackEmptyExceptions {
        if(size() == 0) {
            throw new stackEmptyExceptions();
        }

        T data = head.data;
        head = head.next;
        size--;
        return data;
     }

}