class Node{
    int data;
    Node next;

    Node(int data, Node nextNode){
        this.data = data;
        this.next = nextNode;
    }

    Node(int data){
        this.data = data;
        this.next= null;
    }
}

public class convertArrayToLinkedList {
    private static Node convertArray2LL(int arr[]){
        Node head =new Node(arr[0]);
        Node mover = head;
        for(int i=1; i<arr.length; i++){
            Node temNode = new Node(arr[i]);
            mover.next = temNode;
            // temNode = mover.next;
            mover = temNode;
        }
        return head;
    }

    private static int lengthOfLL(Node head){
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    private static int searchIfPresent(Node head, int k) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == k)
                return 1;
            temp = temp.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[]  arr = {12, 3, 6, 7 };
        Node head = convertArray2LL(arr);
        // System.out.println(head.data);
        
        // Calculate and print the length of the linked list
        System.out.println("Length of Linked List: " + lengthOfLL(head));

        // Traverse the linked list and print the elements
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
        
        // Check if element is present in the linked list
        int check = searchIfPresent(head, 12);
        System.out.println("Is 12 present in the Linked List? : " + (check == 1 ? "Yes" : "No"));
    }
}
