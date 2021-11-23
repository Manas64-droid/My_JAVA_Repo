//! member accessing of base class from derived class
class A{
    int n;
    void see(){
        System.out.println("I am from A "+n);
    }
}
class B extends A{
    int m;
    B(int a,int b){
        super.n=a;
        m=b;
    }
    void seen(){
        System.out.println("I am from B "+m);
    }
    void printBoth(){
        super.see();
        seen();
    }
}
//! costructor accessing 
class C{
    int a;
    C(int x){
        this.a=x;
    }
    void printFirst(){
        System.out.println("I From C "+a);
    }
}
class D extends C{
    int b;
    D(int x,int y){
        super(x);
        this.b=y;
    }
    void printSecond(){
        System.out.println("I From D "+b);
    }
    void printBoth(){
        super.printFirst();
        printSecond();
    }
}

//! this keyword
class F{
    int i;
    void setValue(int i){
        this.i=i;
    }
    void getValue(){
        System.out.println("I am from F "+i);
    }
}
public class superKeyword{
    public static void main(String[] args) {
        B obj= new B(10,20);
        D obj2=new D(23,33);
        F obj1= new F();
        obj.printBoth();
        obj1.setValue(10);
        obj2.printBoth();
        obj1.getValue();
    }
}