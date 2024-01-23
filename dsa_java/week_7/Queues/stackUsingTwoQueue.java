package dsa.dsa_java.week_7.Queues;

public class stackUsingTwoQueue <T>{
    private QueueUsingLL<Integer>q1;
    private QueueUsingLL<Integer>q2;
    int size;

    public stackUsingTwoQueue(){
        this.q1 = new QueueUsingLL<>();
        this.q2 = new QueueUsingLL<>();
        this.size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int element) throws QueueEmptyExceptions{
        if(q1.size() == 0){
            q1.enqueue(element);
        }
        else{
            while (!q1.isEmpty()) {
                q2.enqueue(q1.dequeue());
            }

            q1.enqueue(element);

            while (!q2.isEmpty()) {
                q1.enqueue(q2.dequeue());
            }
        }
        size++;
    }

    public int dequeue() throws QueueEmptyExceptions{
        if(size == 0){
            return -1;
        }
        size--;
        return q1.dequeue();
    }

    public int front() throws QueueEmptyExceptions{
        if(size == 0){
            return -1;
        }
        return q1.front();
    }
}
