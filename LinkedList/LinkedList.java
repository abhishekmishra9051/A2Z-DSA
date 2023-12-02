class Node{
    int data;
    Node next;

    Node(int data, Node nextNode){
        this.data = data;
        this.next = nextNode;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        int[] arr = {22,4,64,65};
        Node y = new Node(arr[0], null);
        System.out.println(y.next);

//         int[] arr = {22, 5, 8, 7};
//         Node x = new Node(arr[0]);
//         System.out.println(x.data);
//         Node y = x;
//         System.out.println("The memory address of the Node 'x' : "+y);

    }
}



