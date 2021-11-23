package Recurssion.PurmutaionCombination;

import java.util.ArrayList;
import java.util.List;

public class unprocesString {
    static List<List<Integer>> subset(int arr[]){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int n:arr){
            int len=outer.size();
            for(int i=0;i<len;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(n);
                outer.add(internal);
            }
        }
        return outer;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(subset(arr));
        /*
        [], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]
        */
    }
}
