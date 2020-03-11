import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> stack;
    private int size;

    Stack() {
        stack = new ArrayList<T>();
        size = 0;
    }

    void push(T object) {
        stack.add(object);
        size++;
    }

    T pop() {
        if (size > 0) {
            T value = stack.get(size-1);
            stack.remove(size-1);
            size--;
            return value;
        }
        else {
            return null;
        }
    }

    T peek(){
        if (size > 0) {
            T value = stack.get(size-1);
            return value;
        }
        else return null;
    }

    void clear() {
        size = 0;
        stack.clear();
    }
}
