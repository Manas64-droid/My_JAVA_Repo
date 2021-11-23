package CWH_OOPS;

class Cyliender{
    private float radius;
    private float hight;
    public void Cyliender(float r,float h){
        radius=r;
        hight=h;
    }
    public void setRed_Hight(float r ,float h){
        this.radius=r;
        this.hight=h;
    }
    public float getRed(){
        return this.radius;
    }
    public float getHight(){
        return this.hight;
    }
    public float volumeCyliender(){
        float volume;
        volume=3.14f*((this.radius*this.radius)*this.hight);
        return volume;
    }
    public float surfaceArea(){
        float surface;
        surface=(2f*(3.14f)*(this.radius*this.radius))+(2f*(3.14f)*(this.radius*this.hight));
        return surface;
    }
}
class Rectagle{
    float length;
    float breadth;

    public Rectagle(){
        this.length=9;
        this.breadth=12;
    }
    public Rectagle(float l,float b){
        this.length=l;
        this.breadth=b;
    }
}
public class CWH_PR9 {
    public static void main(String[] args) {
        /*//! Q.1)
        Cyliender new_Cyliender=new Cyliender();
        new_Cyliender.setRed_Hight(6, 4);
        System.out.println("Redius of cyliender:"+new_Cyliender.getRed()+"\nHight of cylinder:"+new_Cyliender.getHight());
        */

        //! Q.2)
        /*
        Cyliender new_Cyliender=new Cyliender();
        new_Cyliender.setRed_Hight(6, 4);
        System.out.println("Redius of cyliender:"+new_Cyliender.getRed()+"\nHight of cylinder:"+new_Cyliender.getHight());
        System.out.println("Volume is: "+new_Cyliender.volumeCyliender()+"\nSurface is: "+new_Cyliender.surfaceArea());
        */
        //! Q.3)
        /*
        Cyliender new_Cyliender=new Cyliender();
        new_Cyliender.Cyliender(9,12);
        System.out.println("Redius of cyliender:"+new_Cyliender.getRed()+"\nHight of cylinder:"+new_Cyliender.getHight());
        */

        //! Q4)
        Rectagle rect=new Rectagle(8,5);
        System.out.println("Length:"+rect.length);
        System.out.println("Breadth:"+rect.breadth);
        
    }

}
