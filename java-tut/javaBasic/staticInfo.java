package javaBasic;
class PrintInfo{
    static int m;
    static String abc="Manas";
    public static void show(){
        System.out.println("Hello World");
    }
    public static void show(String s){
        String abc=s;
        System.out.println(abc);
    }
}
public class staticInfo{
    
    public static void main(String[] args){
        PrintInfo p1=new PrintInfo();
        // p1.show();
        // p1.m=5;
        // System.out.println(p1.m);
        PrintInfo.show();
        PrintInfo.m=5;
        PrintInfo.show("Rohit");
    }
    
}