package CWH_Practice_Set;
//! Q1-2)
abstract class Pen{
    abstract void write();
    abstract void refill();

}
class FountainPen extends Pen{
    void write(){
        System.out.println("Writting..");
    }
    void refill(){
        System.out.println("Requires to refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
//!-->Q3)
class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class Humen extends Monkey implements basicAnimal{
    public void speekLanguages(){
        System.out.println("Marathi,Hindi,English");
    }
    public void eat(){
        System.out.println("Man is eating");
    }
    public void sleep(){
        System.out.println("Man is sleeping");
    }
}
public class CWH_60_Chp11_PR11 {
    public static void main(String[] args) {
        //! Q1-Q2)
        // FountainPen penObj= new FountainPen();
        // penObj.write();
        // penObj.refill();
        // penObj.changeNib();

        //! Q3)
        // Humen man=new Humen();
        // man.jump();
        // man.bite();
        // man.sleep();
        // man.eat();

        //! Q5) demonstrate polymorphism with Q3)
        //! here humen not inhariting methods of monkey class
        //Monkey animal = new Humen();
        //animal.speekLanguages//! throw error  --> monkey use only jump,bite
        /*
        Monkey dont some methods of humen 
        ! Monkey is refrence and it dont have speekLanguage method it will only use bite,jump methods 
        */



        




    }
}
