public class Abstraction {
    public static void main(String[] args) {
        BMW b1=new BMW();
        Audi a1=new Audi();
        b1.start();
        a1.start();
    }
}
class Audi extends Car{
    @Override
    void start(){
        System.out.println("Audi is started");
    }
}

class BMW extends Car{
    @Override
    void start(){
        System.out.println("BMW is started");
    }
}
abstract class Car{ //! no class object --> aam khao gutliya mat gino
    String name;
    int price; 

    abstract void start();

    void breakes(){
        System.out.println("Car is breaking");
    }

}

