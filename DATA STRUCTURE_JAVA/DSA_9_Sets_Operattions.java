import java.util.*;

public class DSA_9_Sets_Operattions {
    public static void main(String[] args){
        //! HashSet do operations Real Time
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();

        s1.add(45);
        s1.add(23);
        s1.add(56);

        // s2.add(43);
        s2.add(23);
        // s2.add(64);

        /*
        set.addAll(Collection);//! union
        set.retainAll(Collection);//! Interection
        set.containsAll(Collection);//! Interection-> all element of one set be must be present in second set
        */

        // s1.addAll(s2);
        // s1.retainAll(s2);
        boolean result=s1.containsAll(s2);//!{if all elemnt of s2 in s1 Return->True else Result->False}
        System.out.println(result);
    }
}
