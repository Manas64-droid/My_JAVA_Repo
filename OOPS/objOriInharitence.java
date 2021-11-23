public class objOriInharitence {
    public static void main(String[] args) {
        Devloper d1= new Devloper("Manas",21);

        // System.out.println("My name is"+d1.name);
        // System.out.println("My age is"+d1.age);
        d1.walk();
        d1.steps_walk(2000);
        encasulation obj=new encasulation();

        obj.toDo();
        /*
        !when we write public then we can access fucntion 
        !of onother files/?packages
        */
    }
}
class Devloper extends Person{
    public Devloper(String name,int age){
        super(name,age);

    }
    void walk(){//! run time polymorphism
        System.out.println("Devloper "+name+" is walking alone");
    }
}
class Person{
    String name;
    int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    void toDo(){
        System.out.println("Person is working");
    }
    void walk(){//! compile type polymorphism
        System.out.println(name+" is walking alone");
    }
    void steps_walk(int st){//! how many steps name walk=
        System.out.println(name+" walk "+st+" steps");
    }
}
