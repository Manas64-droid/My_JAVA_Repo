import java.util.LinkedList;
import java.util.Queue;

public class DSA_5_Queue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(12);
        q.offer(23);
        q.offer(45);

        
        q.poll();
        q.poll();
        System.out.println(q);

        System.out.println(q.peek());

        /*
        //! throw exception
        q.add();
        q.remove();
        q.element();
        //! dont throw exception
        q.offer();
        q.poll();
        q.peek();
        */

    }
}
