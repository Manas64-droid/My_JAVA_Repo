package CWH_OOPS;
//! abstract class is a class which dont have its object coz its not a class
//! abstract class is standard>> it will help to other class to create stndard 
//! object form it
/*
you can create abstract class from existing abstract class
untill all abstract method will be not get defined we can not creat
concrete class form abstract class..and utill you dont make concreate 
class you can not made object from concreate class
*/
abstract class Mybase{
    public Mybase(){
        System.out.println("i am constructor of base 2");
    }
    public void sayHello(){
        System.out.println("Hello,java");
    }
    
    abstract public void great();
}
class childe2 extends Mybase{//! childe2 is concreate class because it consist all methods from abstract class
    public void great(){
        //@Override
        System.out.println("Good Morning");
    }
}
abstract class childe3 extends Mybase{
    public void th(){
        System.out.println("I am good");
    }
}
public class CWH_53_Chp11_AbstractClass {
    public static void main(String[] args) {
        //! abstract means Existance idea but not having concrete exicistance
        //! Khyali Pulaw_only thought
        childe2 kid2=new childe2();
        kid2.great();

    }
}
