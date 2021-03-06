package LinkedList;

import java.util.Random;

public class mergeSortedLinkedList{
    public static class Node{
        private int data;
        private Node next;
    }
    public static class CustomLinkedList{
        private Node head;
        private Node tail;
        private int size;

        public void addLast(int val){
            Node node =new Node();
            node.data=val;
            node.next=null;
            if(this.size==0){
                head=tail=node;
            }
            else{
                tail.next=node;
                tail=node;
            }
            size++;
        }
        public CustomLinkedList mergeSort(Node head, Node tail){
            if(head == tail){
                CustomLinkedList br = new CustomLinkedList();
                br.addLast(head.data);
                return br;
            }
    
            Node mid = midElement(head, tail);
            CustomLinkedList fsh = mergeSort(head, mid);
            CustomLinkedList ssh = mergeSort(mid.next, tail);
            CustomLinkedList sl = mergeCustomLinkedList(fsh, ssh);
            return sl;
        }
        

        public static CustomLinkedList mergeCustomLinkedList(CustomLinkedList lst1,CustomLinkedList lst2){
            CustomLinkedList ans=new CustomLinkedList();
            Node one=lst1.head;
            Node two=lst2.head;
            while(one!=null && two!=null){
                if(one.data>two.data){
                    ans.addLast(one.data);
                    one=one.next;
                }
                else{
                    ans.addLast(two.data);
                    two=two.next;
                }
            }
            while(one!=null){
                ans.addLast(one.data);
                one=one.next;
            }
            while(two!=null){
                ans.addLast(two.data);
                two=two.next;
            }
            return ans;
        }
        //! for finding mid of LinkedList
        //! move slow by one step & move fast by two till null reaches
        public static Node midElement(Node head,Node tail){
            Node slow=head;
            Node fast=head;
            while(fast!=tail && fast.next!=tail){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }
    } 
    public static void main(String[] args) {
        Random rand=new Random();
        CustomLinkedList lst1=new CustomLinkedList(); 
        CustomLinkedList ans=new CustomLinkedList();
        for(int i=1;i<=10;i++){
            lst1.addLast(rand.nextInt(10));
        }
        lst1.addLast(2);
        lst1.addLast(8);
        lst1.addLast(9);
        lst1.addLast(1);
        lst1.addLast(5);
        lst1.addLast(4);
        lst1.addLast(3);
        // CustomLinkedList lst2=new CustomLinkedList(); 
        // ans=lst1.mergeSorted(lst1.head, lst1.tail);
        // ans=lst2.returnBoth(lst1);
        ans=ans.mergeSort(lst1.head, lst1.tail);
        ans.display();
    }
}
