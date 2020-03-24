import java.util.ArrayList;

// Generic stack class
public class Stack<T> {

    // Variables
    private ArrayList<T> stack;
    private int size;

    // Constructor
    Stack() {
        stack = new ArrayList<T>();
        size = 0;
    }

    // Pushing an object onto the stack
    void push(T object) {
        stack.add(object);
        size++;
    }

    // Popping a value from the stack
    T pop() {
        if (size > 0) {
            T value = stack.get(size-1);
            stack.remove(size-1);
            size--;
            return value;
        }
        // No values to pop, so return null
        else {
            return null;
        }
    }

    // Peeking the from the stack
    T peek(){
        if (size > 0) {
            T value = stack.get(size-1);
            return value;
        }
        // No values so return null
        else return null;
    }

    // Clear the stack
    void clear() {
        size = 0;
        stack.clear();
    }
}
