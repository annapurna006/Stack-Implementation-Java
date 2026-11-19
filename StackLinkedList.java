
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedStack {
    Node top = null;

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    void pop() {
        if (top == null)
            System.out.println("Stack Underflow");
        else {
            System.out.println("Deleted: " + top.data);
            top = top.next;
        }
    }

    void peek() {
        if (top == null)
            System.out.println("Stack is Empty");
        else
            System.out.println("Top: " + top.data);
    }

    void display() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class StackLinkedList {
    public static void main(String[] args) {
        LinkedStack s = new LinkedStack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        s.pop();
        s.peek();
    }
}
