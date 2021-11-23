// import java.util.HashSet;
import java.util.*;
public class CWH_92_HashSet {
    public static void main(String[] args){
        HashSet<Integer> myHashSet =new HashSet<>(6,0.5f);
        myHashSet.add(56);
        myHashSet.add(58);
        myHashSet.add(53);
        myHashSet.add(54);
        myHashSet.add(56);
        System.out.println(myHashSet);
        System.out.println(myHashSet.contains(56));

    }
}
