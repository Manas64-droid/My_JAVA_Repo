import java.util.*;
public class DSA_10_HashMap {
    public static void main(String[] args){
        Map<String,Integer> hMap=new HashMap<>();
        /*
        hMap.put(K,V);
        hMap.putAll(Another HashMap);
        hMap.putIfAbsent(K,V);//! if not present then only put
        hMap.get(K);
        hMap.getOrDefault(K,defaultValue);
        hMap.containsKey(K);//! is key is present or not
        hMap.containsValuse(V);//! is value is present or not
        hMap.replace(K,V);
        hMap.replace(K,oldV,newV);
        hMap.remove(K);
        hMap.remove(K,V);
        hMap.keySet();//! return sets of key values
        hMap.values();//! return sets of values
        hMap.enterySet();//! return set of enteries
        */
        hMap.put("Manas",101);
        hMap.put("Prajwal",102);
        hMap.put("Kaushal",103);
        hMap.put("Ganesh",104);
        hMap.putIfAbsent("Sahil",100);//! update the key value
        System.out.println(hMap);

        System.out.println(hMap.get("Manas"));
    }
}
