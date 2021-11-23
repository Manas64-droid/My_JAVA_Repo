package CWH_OOPS_New;
interface colorSetI{
    void redWater();
    void blueWater();
}
interface colorSetII{
    void redPencil();
    void bluePencil();
}
class drawPicture implements colorSetI,colorSetII{
    public void redWater(){
        System.out.println("Use red water color");
    }
    public void blueWater(){
        System.out.println("Use blue water color");
    }
    public void redPencil(){
        System.out.println("Use red pencil color");
    }
    public void bluePencil(){
        System.out.println("Use blue pencil color");
    }
}
public class CWH_Chp11_59_Polymorphism {
    public static void main(String[] args) {
        colorSetI obj1=new drawPicture();//! dont use onther interface
        //! pencil colors are not allowed to use 
        //! refrence of colorSetI and object of drawPicture
        System.out.println("****use specific type of color only*******\n");
        obj1.redWater();
        obj1.blueWater();
        System.out.println("*****use all types of colors******\n");
        //! if want to use all methods 
        drawPicture obj2=new drawPicture();//! use of all method 
        obj2.redWater();
        obj2.blueWater();
        obj2.redPencil();
        obj2.bluePencil();



    }
}
