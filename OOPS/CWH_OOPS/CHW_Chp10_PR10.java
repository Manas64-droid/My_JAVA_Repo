package CWH_OOPS;
class Circle1{
    public float redius=10f;
    public float area1;
    public void areaOfCir(){
        area1=3.14f*(this.redius*this.redius);
        System.out.println(this.area1);
    }
}
class MyCylinder extends Circle1{
    public float hight=5f;
    public double result1;
    public double hightOfCyl(){
        result1=2*(3.14*(this.redius*this.redius))+2*(3.14f*this.hight*this.redius);
        return result1;
        
    }
}
public class CHW_Chp10_PR10 {
    public static void main(String[] args) {
        //! problem 1:
        Circle1 c1= new Circle1();
        MyCylinder cyl1=new MyCylinder();
        c1.areaOfCir();
        System.out.println(cyl1.hightOfCyl());


    }
}
