package LinkedList;
public class DSA1_LinkedList {
    public static class Node{
        private int data;
        private Node next;
    }
    public static class LinkedList{
        private Node head;
        private Node tell;
        private int size;
        // LinkedList(){
        //     this.size=0;
        // }
        
        // void addLast1(int val){
        //     if(size==0){
        //         Node temp=new Node();
        //         temp.data=val;
        //         temp.next=null;
        //         head=tell=temp;
        //         size++;
        //     }else{
        //         Node temp=new Node();
        //         temp.data=val;
        //         temp.next=null;
        //         tell.next=temp;
        //         tell=temp;
        //         size++;
        //     }
        // }
        void addLast(int val){
            Node node=new Node();
            node.data=val;
            node.next=null;
            if(size==0){
                head=tell=node;
            }
            else{
                tell.next=node;
                tell=node;
            }
            size++;
        }
        void addFirst(int val){
            Node node=new Node();
            node.data=val;
            node.next=head;
            head=node;
            size++;
        }
        void removeFirst(){
            if(this.size==0){
                System.out.println("LinkedList is empety");
            }
            else if(size==1){
                head=tell=null;
                size=0;
            }
            else{
                head=head.next;
                size--;
            }
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println();
        }
        void size(){
            System.out.println("Size of LinkedList->"+size);
        }
        int getFirst(){
            return head.data;
        }
        int getLast(){
            return tell.data;
        }
        int getElement(int index){
            if(size==0){
                System.out.println("List is empty");
                return 0;
            }
            else if(index<0||index>=size){
                System.out.println("Invalid Input");
                return 0;
            }
            Node temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            return temp.data;
        }
    }
    public static void main(String[] args) throws NullPointerException{
        LinkedList lst=new LinkedList();
        for(int i=1;i<=10;i++){
            lst.addLast(i*10);
        }
        lst.display();
        lst.size();
        // for(int i=0;i<9;i++){
        //     lst.removeFirst();
        // }
        // lst.removeFirst();
        System.out.println("1st Element ->"+lst.getFirst()+
        "\nLast Element ->"+lst.getLast()+
        "\nElement @ Index ->"+lst.getElement(0));
        lst.addFirst(64);
        System.out.println("1st Element ->"+lst.getFirst()+
        "\nLast Element ->"+lst.getLast()+
        "\nElement @ Index ->"+lst.getElement(6));
        lst.display();
    }
}

