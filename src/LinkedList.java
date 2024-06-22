public class LinkedList {
    public static void main(String[] args){
        LinkedList ll = new LinkedList(1000);
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);

        //ll.removeEnd();
        System.out.println(ll.get(1).value);
        //ll.printNode();
    }
    Node head;
    Node tail;
    int length;
    public Node get(int index){
        if(index<0||index>length){
            return null;
        }else{
            Node temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            return temp;
        }
    }
    LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length=1;
    }
    public void printNode(){
        Node temp = head;
        for(int i = 0; i < length; i++){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public void prepend(int value){
        Node nn = new Node(value);
        if(length == 0){
            head = nn;
            tail = nn;
        }else{
            nn.next = head;
            head = nn;
        }
        length++;
    }
    public void append(int value){
        Node nn = new Node(value);
        if(length == 0){
            head = nn;
            tail = nn;
        }else{
            tail.next = nn;
            tail = nn;
        }
        length++;
    }
    public Node removeBeg(){
        if(length==0){
            return null;
        }else{
            Node temp = head;
            head = head.next;
            temp.next = null;
            length--;
            if(length==0){
                head = null;
                tail = null;
            }
            return temp;
        }
    }
    public Node removeEnd(){
        if(length==0) {
            return null;
        }else{
            Node temp = head;
            Node pre = head;
            while(temp.next!=null){
                pre = temp;
                temp= temp.next;
            }
            tail = pre;
            tail.next = null;
            length--;
            if(length==0){
                head = null;
                tail = null;
            }
            return temp;
        }
    }
}
