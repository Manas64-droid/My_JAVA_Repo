import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class DSA_8_Set {
    public static void main(String[] args) {
        // Set<String>set=new HashSet<>();
        //! HashSet do operations Constant Time
        // Set<String>set=new LinkedHashSet<>();//! for getting what we type in order
        //! LinkedSet do operation linear Time
        Set<String>set=new TreeSet<>();//! for getting sorted order elemnts
        //! TreeSet do operations in LogN Time
        /*
        set.add();
        set.addAll(Collection);//! union
        set.remove();
        set.removeAll();
        set.retainAll();//! Intersection
        set.clear();
        set.size();
        set.contains();
        set.isEmpty();
        set.contaisAll();//! Subset
        set.toArray();
        */
        set.add("Banana");
        set.add("Apple");
        set.add("Kiwi");
        // set.add("Kiwi");//! repeatation is not allowed
        System.out.print(set);

    }
}
