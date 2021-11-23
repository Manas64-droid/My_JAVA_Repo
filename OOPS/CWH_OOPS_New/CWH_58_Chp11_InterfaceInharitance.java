package CWH_OOPS_New;

import javax.print.attribute.standard.PrinterInfo;

interface Method_I{
    void meth1();
    void meth2();
}
interface Method_II extends Method_I{
    void meth3();
    void meth4();
}
class typeOfMethods implements Method_II{
    public void meth1(){
        System.out.println("I am meth 1");
    }
    public void meth2(){
        System.out.println("I am meth 2");
    }
    public void meth3(){
        System.out.println("I am meth 3");
    }
    public void meth4(){
        System.out.println("I am meth 4");
    }
}
public class CWH_58_Chp11_InterfaceInharitance {
    void printInfo(){
        System.out.println("<A>");
    }
    public static void main(String[] args) {

        typeOfMethods obj=new typeOfMethods();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
