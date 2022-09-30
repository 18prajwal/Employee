class Node{
    int data;
    Node nextNode;
    Node(int data){
        this.data=data;
        this.nextNode=null;
    }
}

class MyLinkedList{
    Node add(int data){
        Node newNode=new Node(data);
        return newNode;

    }
    int lastdata(Node n){
        int n0=n.nextNode.nextNode.data;
        return n0;
    }
}


public class MyLinkedList_1{
    public static void main(String[] args) {
        System.out.println("LinkedLists");
        MyLinkedList obj1=new MyLinkedList();
        Node n1=obj1.add(5);
        Node n2=obj1.add(7);
        Node n3=obj1.add(9);
        Node n4= obj1.add(11);
        n1.nextNode=n2;
        n2.nextNode=n3;
        n3.nextNode=n4;
       int ld= obj1.lastdata(n1);
        System.out.println(ld);

    }
}
