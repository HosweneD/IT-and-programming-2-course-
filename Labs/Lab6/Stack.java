class Stack<T> {
    private T[] data;
    private int size;

    public Stack(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    // Добавление
    public void push(T element) {
        try {
            data[size] = element;
            size++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Переполнение стека");
        }
    }

    // Удаление
    public T pop() {
        if (size > 0) {
            T element = data[size - 1];

            data[size - 1] = null;
            size--;

            return element;
        } else {
            return null;
        }
    }

    // Просмотр
    public T peek() {
        if (size > 0) {
            return data[size - 1];
        } else {
            return null;
        }
    }
}

class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<> (3);

        System.out.println(stack.pop());
        System.out.println(stack.peek());

        stack.push(16);
        stack.push(2);
        stack.push(7);

        System.out.println(stack.pop());
        System.out.println(stack.peek());

        stack.push(4);

        System.out.println(stack.peek());
    }
}