package CWH_OOPS;
class Emp{
    String name;
    int salary;
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
        System.out.println("->"+n);
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int s){
        this.salary=s;
        System.out.println("->"+s);
    }
}
class cellphone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void vibrate() {
        System.out.println("vibrating....");
    }
}
class sequare{
    float sides=4;
    float result_are;
    float result_peri;
    float areaSqr(float a) {
        result_are=a*a;
        return result_are;
    }
    float perimeter(float p) {
        result_peri=4*p;
        return result_peri;
    }
}
class rectangle{
    float result_area=0;
    float result_peri=0;
    public float areaRec(float l,float b){
        result_area=l*b;
        return result_area;
    }
    public float periRec(float l,float b){
        result_peri=2*(l+b);
        return result_peri;
    }

}
class circle{
    float result_circule_area;
    float result_circule_perimeter;

    public float areaCir(float redius){
        result_circule_area=3.14f*redius;
        return result_circule_area;
    }
    public float periCir(float redius){
        result_circule_perimeter=2*(3.14f*redius);
        return result_circule_perimeter;
    }

}
public class CWH_PR8_Classes {
    public static void main(String[] args) {
        /*
        !problem number1
        Emp e1=new Emp();
        e1.name="Manas";
        e1.salary=1500;
        System.out.println(e1.getName());

        e1.getName();
        e1.setName("noaf");
        // System.out.println(e1.name);
        
        System.out.println(e1.getSalary());
        e1.setSalary(6000);*/

        /*cellphone c1=new cellphone();
        c1.ring();
        c1.vibrate();*/

        /*sequare sq=new sequare();
        System.out.println("Area of Square="+sq.areaSqr(4)+"\nPerimeter of square="+sq.perimeter(3));
        */

        /*rectangle sq=new rectangle();
        System.out.println("Area of Rectangle="+sq.areaRec(5.5f, 1f)+"\nPerimeter of Rectangle="+sq.periRec(5.5f, 1f));
        */

        circle c1=new circle();
        System.out.println("Area of circle="+c1.areaCir(5)+"\nPerimeter of circle="+c1.periCir(5));
        
    }
}
