public class binarytreetodoublylinkedlist
{
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public Node root;
    Node head, tail = null;
    public void binarytreetodoublylinkedlist(Node node) {
        if(node == null)
            return;
        binarytreetodoublylinkedlist(node.left);
        if(head == null) {
            head = tail = node;
        }
        else {
            tail.right = node;
            node.left = tail;
            tail = node;
        }
        binarytreetodoublylinkedlist(node.right);
    }
    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of generated doubly linked list: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.right;
        }
        System.out.println();
    }
    public static void main(String[] args) {

        binarytreetodoublylinkedlist bt = new binarytreetodoublylinkedlist();

        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);

        bt.binarytreetodoublylinkedlist(bt.root);
        bt.display();
    }
}
