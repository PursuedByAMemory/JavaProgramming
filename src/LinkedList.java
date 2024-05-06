public class LinkedList {
    class Node{
        int val;
        Node next;  //Node means the var "next" points to a node or is a pointer
        Node(int val){
            this.val = val;
        }
    }
    private Node head; //of type node meaning, it points to a node
    private Node tail; //of type node meaning it points to a node
    private int length;
    public LinkedList(int val){
        Node node1 = new Node(val);
        head = node1;
        tail = node1;
        length = 1;
    }
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public void getHead(){
        System.out.println("Head: "+head.val);
    }
    public void getTail(){
        System.out.println("Tail: "+tail.val);
    }
    public void getLength(){
        System.out.println("Length "+length);
    }
    public void append(int val){
        Node newNode = new Node(val);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    public static void main(String[] args) {
        LinkedList LL1 = new LinkedList(8); //Creating a new LinkedList || LL1 can point to a linkedList || LL1 is variable of type LinkedList
        LL1.append(2);
        LL1.getHead();
        LL1.getTail();
        LL1.getLength();
        LL1.printList();
    }
}