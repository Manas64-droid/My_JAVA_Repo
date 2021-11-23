package CWH_OOPS;

import javax.swing.text.AsyncBoxView.ChildLocator;

class Based{
    // public int v;
    Based(){
        System.out.println("I am constructor");
    }
    Based(int a){
        System.out.println("I am overloded constructor with a:"+a);
    }

}
class Derived extends Based{
    // int w;
    
    Derived(){
        System.out.println("I am derived class constructor");
    }
    Derived(int a,int b){
        super(a);
        System.out.println("I am overloded constructor of derived with b:"+b);
    }

}
class childeOfDerived extends Derived{
    childeOfDerived(){
        System.out.println("I am childe of derived constructor");
    }
    childeOfDerived(int a,int b,int c){
        super(a,b);
        System.out.println("I am overloded constructor of derived's childe with c:"+c);
        
    }
}
public class CWH_46_Constructors_Inharitance {
    public static void main(String[] args) {
        // Based b1=new Based();
        // Derived d1=new Derived(4,9);
        // childeOfDerived cd=new childeOfDerived(6,5,4);

        
    }

}
