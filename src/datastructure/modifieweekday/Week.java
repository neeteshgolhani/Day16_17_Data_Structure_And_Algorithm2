package datastructure.modifieweekday;

    // Modified Week class that uses two stacks to store the queue
    class Week<T> {
        private Stack<T> stack1;
        private Stack<T> stack2;

        public Week() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void addDay(T day) {
            stack1.push(day);
        }

        public T removeDay() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

        public boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }