package Recurssion.PurmutaionCombination;

import java.util.ArrayList;

public class DSA1_Recursion_Subsequence 
{
    static void subSequence(String processeable,String unUnprocessable){
        if(unUnprocessable.isEmpty()){
            System.out.println(processeable);
            return;
        }
        char ch=unUnprocessable.charAt(0);
        subSequence(processeable+ch,unUnprocessable.substring(1));
        subSequence(processeable,unUnprocessable.substring(1));
    }

    static ArrayList<String> subSequence1(String processString,String unprocesString){
        if(unprocesString.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(processString);
            return list;
        }
        char ch=unprocesString.charAt(0);
        ArrayList<String> left=subSequence1(processString+ch, unprocesString.substring(1));
        ArrayList<String> right=subSequence1(processString, unprocesString.substring(1));
        left.addAll(right);
        return left;
    }

    static void subSequence2(String processable,String unProcessable){
        if(unProcessable.isEmpty()){
            System.out.println(processable);
            return;
        }
        char ch=unProcessable.charAt(0);
        subSequence2(processable+ch, unProcessable.substring(1));
        subSequence2(processable, unProcessable.substring(1));
        subSequence2(processable+(ch+0), unProcessable.substring(1));
    }
    // static ArrayList<String> subSequence3(String processable,String unProcessable){
    //     if(unProcessable.isEmpty()){
    //         ArrayList<String> list=new ArrayList<>();
    //         list.add(processable);
    //         return list;
    //     }
    //     char ch=processable.charAt(0);
    //     ArrayList<String> left1=subSequence3(processable+ch, unProcessable.charAt(1));
    //     ArrayList<String> right2=subSequence3(processable, unProcessable.charAt(1));

    // }
    public static void main(String[] args) {
        String a="abc";
        // subSequence("", a);
        // System.out.println(a.substring(1));
        // System.out.println(subSequence1("", "abc"));
        // subSequence2("", "abc");
    }
}
