public class LL {
    public static void main(String[] args){
        LL newLL = new LL(4);
//        newLL.append(7);
//        newLL.prepend(11);
//        newLL.insert(1,20);
//        //System.out.println(newLL.removeLast().value);
//        newLL.printList();
        newLL.append(7);
        newLL.append(11);
        newLL.insert(1,100);
        newLL.remove(1);
        newLL.printList();
    }

    class Node {
        Node next;
        int value;

        Node(int value) {
            this.value = value;
        }
    }

    Node head;
    Node tail;
    int length;

    public LL(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if(length == 0) {
            return null;
        }
        Node pre = head;
        Node temp = head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head=null;
            tail=null;
        }
        return temp;
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head=newNode;
            tail = newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
        length++;
    }

    public Node get(int index){
        if(index<0||index>length){
            return null;
        }
        Node temp = head;
        for(int i = 0; i< index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node newNode = new Node(value);

        if(index<0||index>=length){
            return false;
        }
        Node temp = head;
        for(int i = 0; i< index ;i++){
            temp = temp.next;
        }
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }
    public Node removeFirst(){
        if(length==0){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length==0){
            tail=null;
        }
        return temp;
    }
    public Node remove(int index){
        if(index<0||index>length){
            return null;
        }
        if(index == 0){
            return removeFirst();
        }
        if(index == length){
            return removeLast();
        }
        Node prev = get(index-1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public boolean insert(int index,int value){
        if(index<0||index>length){
            return false;
        }
        if(index==0){
            prepend(value);
            return true;
        }
        if(index==length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }
}