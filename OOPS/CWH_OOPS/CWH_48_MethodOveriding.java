package CWH_OOPS;
class A{
    public int a;
    public int Manny(){
        return 4;
    }
    public void mathod2(){
        System.out.println("i am method 2 of class A");
    }
}
class B extends A{
    @Override
    //! redefining method of super class argument must be same
    //! return type must be same or sub type of privous return type
    //! access level not be restricting
    //!! we can not overide static method and final method also
    public void mathod2(){
        System.out.println("i am method 2 of class B");
    }
    public void mathod3(){
        System.out.println("i am method 3 of class B");
    }
}
public class CWH_48_MethodOveriding {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();

        a.mathod2();
        b.mathod2();
    }
}
