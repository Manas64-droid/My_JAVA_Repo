package CWH_OOPS;
class base{
    int a;
    int b;
    public int getBatch1(){
        return a;
    }
    public int getBatch2(){
        return b;
    }
    public void setBatch(int num1,int num2){
        this.a=num1;
        this.b=num2;
    }
}
class Derive extends base{
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}
public class CWH_Inharitance {
    public static void main(String[] args){
        base b=new base();
        Derive d =new Derive();
        b.setBatch(4,4);
        System.out.println("Base Class getB:"+b.getBatch2());
        d.setBatch(5,5);
        System.out.println("Derive Class getB:"+d.getBatch2());
    }
}
