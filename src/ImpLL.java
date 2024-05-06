public class ImpLL {
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    Node head;
    Node tail;
    int length=0;
    ImpLL(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length=1;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if(length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }
    public Node removeLast(){
        if(length==0){
            return null;
        }
        Node temp = head;
        Node pre = head;
        while(temp.next!=null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length==0){
            tail = null;
            head = null;
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node newNode = new Node(value);
        if(index<0 || index>length){
            return false;
        }
        Node temp = head;
        for(int i=0;i < index;i++){
            temp = temp.next;
        }
        if(temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public Node get(int index){
        if(index<0 || index>length){
            return null;
        }
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean insert(int index, int value){
        if(index<0 || index>length){
            return false;
        }
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
        Node temp=head;
        for(int i = 0;i<index;i++){
            temp=temp.next;
        }
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public static void main(String[] args){

    }
}
