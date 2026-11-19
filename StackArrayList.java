
import java.util.ArrayList;

class MyStack {
    ArrayList<Integer> list = new ArrayList<>();

    void push(int data) {
        list.add(data);
    }

    void pop() {
        if (list.isEmpty())
            System.out.println("Stack Underflow");
        else
            System.out.println("Deleted: " +
                list.remove(list.size() - 1));
    }

    void peek() {
        if (list.isEmpty())
            System.out.println("Stack is Empty");
        else
            System.out.println("Top: " +
                list.get(list.size() - 1));
    }

    void display() {
        for (int i = list.size() - 1; i >= 0; i--)
            System.out.println(list.get(i));
    }
}

public class StackArrayList {
    public static void main(String[] args) {
        MyStack s = new MyStack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        s.pop();
        s.peek();
    }
}
