import java.util.LinkedList;

public class LinkedListDemo {
    private LinkedList<Integer> list;

    public LinkedListDemo() {
        list = new LinkedList<>();
    }

    public void display() {
        System.out.println("Current List: " + list);
    }

    public static void main(String[] args) {
        LinkedListDemo demo = new LinkedListDemo();

        // Test operations
        demo.insert(10);  // Dev A adds this
        demo.insert(20);  // Dev A adds this
        demo.display();

        demo.delete(10);  // Dev B adds this
        demo.display();
    }
}

