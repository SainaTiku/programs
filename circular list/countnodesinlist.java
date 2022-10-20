public class countnodesinlist
{
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public int count;
    public Node head = null;
    public Node tail = null;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    public void countNodes() {
        Node current = head;
        do{
            count++;
            current = current.next;
        }while(current != head);
        System.out.println("Count of nodes present in circular linked list: "+count);
    }

    public static void main(String[] args) {
        countnodesinlist cl = new countnodesinlist();
        cl.add(1);
        cl.add(2);
        cl.add(4);
        cl.add(1);
        cl.add(2);
        cl.add(3);
        cl.countNodes();
    }
}
