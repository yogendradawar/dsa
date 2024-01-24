package dsa.dsa_java.week_7.Test_2;

    class Node<T> {
        public T data;
        public Node<T> next;
    
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    
        public T getData() {
            return data;
        }
    
        public void setData(T data) {
            this.data = data;
        }
    }

