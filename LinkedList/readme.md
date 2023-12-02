### Linked List Visualization

```plaintext
// Initial State
Head -> [10] -> [20] -> null
^ 
|
current

// After one iteration
Head -> [10] -> [20] -> null
       ^ 
       |
       current.next
       current

// After two iterations
Head -> [10] -> [20] -> null
              ^ 
              |
              current.next
              current

// After reaching the end (null)
Head -> [10] -> [20] -> null
                    ^ 
                    |
                    null (current.next)
                    current

```
### Clean Code

```java
// Custom implementation of LinkedList

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class LinkedList {
    Node head;

    public void addToEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToEnd(10);
        list.addToEnd(20);
        list.displayList();
    }
}

```