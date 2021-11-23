package CWH_OOPS;
interface Bicycle{
    int a=64;//! interface properties are final
    void applyBreak(int decrement);
    void speedUp(int increment);

    //! interface dont have constructors..and seters and geters
    // Bicycle(){
    //     this.a=96;
    // }
}
interface newBicycle{
    void hornBajaO();
}

class a1Cycle implements Bicycle,newBicycle{
    public void applyBreak(int decrement){
        System.out.println("applying break:"+decrement);
    }
    public void speedUp(int increment){
        System.out.println("applying boost");
    }
    public void hornBajaO(){
        System.out.println("Dhinkchika..Dhinkchika..pa..pa..pa..pa");
    }

}
class a2Cycle extends a1Cycle{
    public void applyBreak(int d){
        System.out.println("I am children class and i am breaking"+d);
    }
}
public class CWH_54_Chp11_Interferences {
    public static void main(String[] args) {
        a1Cycle mereCycle=new a1Cycle();
        mereCycle.applyBreak(45);
        a2Cycle mereDusrCycle=new a2Cycle();
        mereCycle.applyBreak(56);

    }
}
