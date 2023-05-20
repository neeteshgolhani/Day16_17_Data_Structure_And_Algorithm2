package datastructure.primenumberanagramqueue;
 class Queue<T> {
        private Node<T> front;
        private Node<T> rear;

        public Queue() {
            this.front = null;
            this.rear = null;
        }

        public void enqueue(T data) {
            Node<T> newNode = new Node<>(data);
            if (isEmpty()) {
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
        }

        public T dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            T data = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return data;
        }

        public T peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            return front.data;
        }

        public boolean isEmpty() {
            return front == null;
        }
}
