import java.util.*;

public class DSA_3_LInkedList_vs_ArrayList {

    static void getDiff(List<Integer> list){
        long start=System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            list.add(0,i);
        }
        long stop=System.currentTimeMillis();
        System.out.println(list.getClass().getName()+"->"+(stop-start));
    }

    public static void main(String[] args){
        List<Integer>a1=new ArrayList<>();
        List<Integer>l1=new LinkedList<>();
        getDiff(a1);
        getDiff(l1);
    }
}
