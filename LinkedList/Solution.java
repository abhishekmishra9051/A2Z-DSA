import java.util.Scanner;

class Node {
    public int data;
    public Node next;

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}


// Introduction To Linked List
public class Solution {
    public static Node constructLL(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node tail = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            tail.next = newNode;
            tail = newNode;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Node head = constructLL(arr);

        System.out.println("Linked List elements:");
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        
        scanner.close();
    }
}
