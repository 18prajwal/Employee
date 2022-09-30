import java.util.ArrayList;

class Node{
    int data;
    Node nextNode;

    Node(int data){
        this.data=data;
        this.nextNode=null;
    }
}
class MyLisnkedList {
    Node head;
    Node add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node lastNode=head;
            while (lastNode.nextNode!=null){
                lastNode=lastNode.nextNode;
            }
            lastNode.nextNode=newNode;
        }
        return newNode;
    }
    void Display(){
        Node presentNode=head;
        while(presentNode.nextNode!=null){
            System.out.print(presentNode.data + "--> ");
            presentNode=presentNode.nextNode;
        }
        System.out.println(presentNode.data);

    }
}

class MyLinkedList_1{
    public static void main(String[] args) {
      MyLisnkedList list=new MyLisnkedList();
      list.add(10);
      list.add(1000);
      list.add(9287);
      list.Display();
       
    }
}

