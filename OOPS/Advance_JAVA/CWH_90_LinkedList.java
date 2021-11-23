package Advance_JAVA;

import java.util.LinkedList;

public class CWH_90_LinkedList {
    public static void main(String[] args) {
    LinkedList<Integer> abcd1=new LinkedList<>();
    LinkedList<Integer> abcd2=new LinkedList<>();
    
    abcd2.add(5);
    abcd2.add(4);

    abcd1.add(89);
    abcd1.add(59);
    abcd1.add(29);
    abcd1.add(55);
    abcd1.add(66);
    abcd1.add(0,89);
    abcd1.add(29);
    abcd1.add(0,1);
    abcd1.addAll(2,abcd2);

    abcd1.addFirst(455);
    abcd1.addLast(755);

    abcd1.push(850);
    abcd1.pop();

    // abc1.set(0,566);    //! <----

    // abc1.clear();

    // System.out.println(abc1.contains(88))    //! <----

    // System.out.println(abc1.indexOf(89));    //! <----

    // System.out.println(abc1.lastIndexOf(29));    //! <----

    // System.out.println(abc1.remove(9));  //! <----

    for(int i=0;i<abcd1.size();i++){
        System.out.print(abcd1.get(i)+" ");
    }
    }
}
