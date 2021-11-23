package Recurssion.PurmutaionCombination;

import java.util.ArrayList;
public class DSA3_Recursion_Purmutation {
    static void permutaionOfString(String processable,String unprocessable){
        if(unprocessable.isEmpty()){
            System.out.println(processable);
            return;
        }
        char ch=unprocessable.charAt(0);
        for(int i=0;i<=processable.length();i++){
            String first=processable.substring(0, i);
            String last=processable.substring(i,processable.length());
            permutaionOfString(first+ch+last, unprocessable.substring(1));
        }
    }
    static int permutaionOfStringCount(String process,String unprocess){
        if(unprocess.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=unprocess.charAt(0);
        for(int i=0;i<=process.length();i++){
            String fisrt=process.substring(0, i);
            String second=process.substring(i,process.length());
            count=count+permutaionOfStringCount(fisrt+ch+second, unprocess.substring(1));
        }
        return count;
    }
    static ArrayList<String> permutationArrayList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list1=new ArrayList<>(); 
        char ch=up.charAt(0);
        for(int i=0;i<p.length();i++){
            String first=p.substring(0, i);
            String last=p.substring(i, p.length());
            list1.addAll(permutationArrayList(first+ch+last,up.substring(1)));
        }
        return list1;
    }
    public static void main(String[] args) {
        permutaionOfString("", "abcd");
        System.out.println(permutaionOfStringCount("", "abcd"));
        // String a="abcde";
        // System.out.println(a.substring(1,3));
        // System.out.println(permutationArrayList("", "abc"));
    }
}
