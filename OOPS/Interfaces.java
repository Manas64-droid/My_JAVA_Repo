public class Interfaces implements car,robo{
    public static void main(String[] args) {
        String name; 

    }
    // @Override;
    public void start(){
        System.out.println("my car is starting");

    }
    // @Override
    public void walk(){
        System.out.println("my car is starting");

    }

}

interface car{
    void start();
}
interface robo{
    void walk();
}