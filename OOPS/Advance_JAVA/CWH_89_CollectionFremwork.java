package Advance_JAVA;
import java.util.ArrayList;
public class CWH_89_CollectionFremwork {
    public static void main(String[] args) {
    ArrayList<Integer> abc1=new ArrayList<>();
    ArrayList<Integer> abc2=new ArrayList<>(8);
    
    abc2.add(5);
    abc2.add(4);

    abc1.add(89);
    abc1.add(59);
    abc1.add(29);
    abc1.add(55);
    abc1.add(66);
    abc1.add(0,89);
    abc1.add(29);
    abc1.add(0,1);
    abc1.addAll(2,abc2);

    // abc1.set(0,566);    //! <----

    // abc1.clear();

    // System.out.println(abc1.contains(88))    //! <----

    // System.out.println(abc1.indexOf(89));    //! <----

    // System.out.println(abc1.lastIndexOf(29));    //! <----

    // System.out.println(abc1.remove(9));  //! <----

    for(int i=0;i<abc1.size();i++){
        System.out.print(abc1.get(i)+" ");
    }
    }
}
