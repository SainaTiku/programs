public class insertionatstart
{
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public Node head = null;
    public Node tail = null;
    public void addAtStart(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else {
            Node temp = head;
            newNode.next = temp;
            head = newNode;
            tail.next = head;
        }
    }
    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Adding nodes to the start of the list: ");
            do{
                System.out.print(" "+ current.data);
                current = current.next;
            }while(current != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        insertionatstart cl = new insertionatstart();
        cl.addAtStart(1);
        cl.display();
        cl.addAtStart(2);
        cl.display();
        cl.addAtStart(3);
        cl.display();
        cl.addAtStart(4);
        cl.display();
    }
}
