import java.util.*;
public class DSA_7_PriorityQueue{
    public static void main(String[] args){
        PriorityQueue<String>pstr=new PriorityQueue<>();
        PriorityQueue<Integer>pint=new PriorityQueue<>();

        pstr.add("Prajwal");
        pstr.add("Ganesh");
        pstr.add("Kaushal");
        pstr.add("Manas");

        System.out.println(pstr);
        System.out.println(pstr.poll());
        System.out.println(pstr.poll());
        System.out.println(pstr.poll());
        System.out.println(pstr.poll());
        System.out.println("********************");

        pint.add(45);
        pint.add(100);
        pint.add(1);
        pint.add(12);

        System.out.println(pint);
        System.out.println(pint.poll());
        System.out.println(pint.poll());
        System.out.println(pint.poll());
        System.out.println(pint.poll());


    }
}