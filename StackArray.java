
class Stack {
    int arr[] = new int[5];
    int top = -1;

    void push(int data) {
        if (top == arr.length - 1)
            System.out.println("Stack Overflow");
        else
            arr[++top] = data;
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else
            System.out.println("Deleted: " + arr[top--]);
    }

    void peek() {
        if (top == -1)
            System.out.println("Stack is Empty");
        else
            System.out.println("Top: " + arr[top]);
    }

    void display() {
        for (int i = top; i >= 0; i--)
            System.out.println(arr[i]);
    }
}

public class StackArray {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        s.pop();
        s.peek();
    }
}
