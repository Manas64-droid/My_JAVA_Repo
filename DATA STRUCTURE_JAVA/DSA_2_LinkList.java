import java.util.*;
public class DSA_2_LinkList {
    public static void main(String[] args){
        LinkedList<String> nobj1=new LinkedList<>();
        nobj1.add("Manas");
        nobj1.add("Kaushal");

        LinkedList<String>nobj2=new LinkedList<>();

        nobj2.add("Ganesh");
        nobj2.add("Prajwal");

        nobj1.addAll(nobj2);
        // nobj1.set(0,"Rohit");
        // nobj1.remove(0);
        System.out.println(nobj1);

        LinkedList<String>toRemove=new LinkedList<>();
        toRemove.add("Manas");
        toRemove.add("Prajwal");

        nobj1.removeAll(toRemove);
        System.out.println(nobj1);


        // nobj1.clear();
        System.out.println(nobj1.size());
        System.out.println(nobj1.contains("Manas"));
        System.out.println(nobj1.isEmpty());

        String arr[]=new String[nobj1.size()];
        nobj1.toArray(arr);
        for(String e:arr){
            System.out.println(e);
        }

        

    }
}
