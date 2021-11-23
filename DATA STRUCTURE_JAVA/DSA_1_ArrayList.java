import java.util.ArrayList;

public class DSA_1_ArrayList {
    public static void main(String[] args){
        ArrayList<String> fruits=new ArrayList<>();//! <> ->no generics is added
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("orange");
        fruits.add("Hiiii");
        // fruits.add(45);
        // System.out.println(fruits);

        ArrayList<String> vegitable=new ArrayList<>();
        vegitable.add("Tematto");//! add method<--
        vegitable.add("Carrot");
        vegitable.add("onion");

        fruits.addAll(vegitable);//! addAll method<--collection in collection
        fruits.set(0, "Mango");//! .set method replace element on present index
        System.out.println(fruits.get(5));//! .get(index) method give element on present index
        // System.out.println(fruits);
        fruits.remove(3);//! .remove(index) method remove element present on index
        // System.out.println(fruits);

        ArrayList<String> toRemove=new ArrayList<>();
        toRemove.add("Apple");
        toRemove.add("orange");

        fruits.removeAll(toRemove);//! .removeAll(Collection) take collaction as input and remove them
        // System.out.println(fruits);

        // fruits.clear(); //! .clear() method clear all elements present in the list
        // System.out.println(fruits);

        System.out.println(fruits.size());//! return size of arrayList
        System.out.println(fruits.contains("Guawa"));
        //! for cheaking elemtnt peresent in list or not
        //! if present return true else return false <Boolean>
        System.out.println(fruits.isEmpty());
        //! for cheaking list is empty or not
        //! if elements are present return false else return true <Boolean>
        
        System.out.println("*****************");
        String temp[]=new String[fruits.size()];
        fruits.toArray(temp);//! this method convert arraylist into Array
        for(String e: temp){
            System.out.println(e);
        }
        





        /*
        Note: DSA_1_ArrayList.java uses unchecked or unsafe operations.
        Note: Recompile with -Xlint:unchecked for details.
        [Apple, 45]
        */
        Pair<String,Integer> obj1=new Pair<String,Integer>("Manas", 43);
        Pair<Boolean,String> obj2=new Pair<Boolean,String>(true, "True");
        
        // obj1.getDis();
        // obj2.getDis();


    }
}
