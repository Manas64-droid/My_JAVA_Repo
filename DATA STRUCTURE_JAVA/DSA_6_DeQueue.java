import java.util.ArrayDeque;
import java.util.Deque;

public class DSA_6_DeQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
        //Deque<Integer> dq=new ArrayDeque<Integer>();
        //ArrayDeque<Integer> dq=new LInkedList<Integer>();
        //! we can implement with ArrayDeque/LinkedList
        /*
        ! does not throw exceptions
        dq.offer();
        dq.offerFirst();
        dq.offerLast();

        dq.poll();
        dq.pollFirst();
        dq.pollLast();

        dq.peek();
        dq.peekFirst();
        dq.peekLast():

        dq.push();
        dq.pop();
        dq.peek();
        ! throw exceptions
        dq.add();
        dq.addFirst();
        dq.addLast();

        dq.remove();
        dq.removeFirst();
        dq.removeLast();

        dq.element();
        dq.getFirst();
        dq.getLast();


        */
        dq.offerFirst(12);
        dq.offerLast(112);
        dq.offerLast(1112);
        dq.offerLast(1112);
        dq.offerLast(11112);
        System.out.println(dq);

        dq.pollFirst();
        dq.pollLast();
        System.out.println(dq);

        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
    }
}
