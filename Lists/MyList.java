package Lists;

public class MyList {
    Node head;


    public Node pushFront(int value){
        Node node = new Node();
        node.value = value;
        Node current = head;

        if(current != null){
           node.next = head;
        }
        head = node;
        return node;
    }


    public Node pushBack(int value){
        Node node = new Node();
        node.value = value;
        Node current = head;

        if(current == null){
            head = node;
        }else{
            while(current.next != null)
                current = current.next;
            current.next = node;
        }
        return node;
    }

    public void popBack(){
        Node current = head;

        if(current != null){
            while(current.next != null && current.next.next != null)
                current = current.next;
            if(current.next == null)
                head = null;
        }
    }

    public void print(){
        Node current = head;
        while(current != null){
            System.out.printf("%d ", current.value);
            current = current.next;
        }
    }

    public Node find(int value){
        Node current = head;
        while(current != null){
            if(current.value == value){
                return current;
            }
            current = current.next;
        }
        return null;
    }


    public class Node {
        int value;
        Node next;
    }
}
