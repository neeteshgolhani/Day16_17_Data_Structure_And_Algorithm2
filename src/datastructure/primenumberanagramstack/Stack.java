package datastructure.primenumberanagramstack;
    class Stack<T> {
        private Node<T> top;

        public Stack() {
            this.top = null;
        }

        public void push(T data) {
            Node<T> newNode = new Node<>(data);
            if (top == null) {
                top = newNode;
            } else {
                newNode.next = top;
                top = newNode;
            }
        }

        public T pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            T data = top.data;
            top = top.next;
            return data;
        }

        public T peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }
    }
