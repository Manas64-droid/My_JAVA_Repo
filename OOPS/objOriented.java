public class objOriented {
    public static void main(String[] args) {
        
        Person p1=new Person();//! 1 way of calling constructor
        Person p2=new Person("Pooja",21);//! 2 way of calling constructor
        Devloper d1=new Devloper("Manas_D", 20);


        p1.name="Manas";
        p1.age=20;

        // p2.name="Pooja";
        // p2.age=21;


        System.out.println(p1.name+" is "+p1.age+" years old");
        System.out.println(p2.name+" is "+p2.age+" years old");//! count not increse coz its class perperty
        //! we can make n numbers of objects from class
        //! every class have properties and behavior
        p1.walk();
        p1.struggle();
        p1.steps_walk(2000);

        System.out.println(Person.count);//! we can not making any object of person--we can access with class
        d1.walk();
    }

}
class Devloper extends Person{
    public Devloper(String name,int age){
        super(name,age);
    }
}
class Person{
    //! properties of class
    String name;
    int age;

    static int count;//! property of class by using static keyword --not depende on object and constat for class
    public Person(){
        count++;//! constructor
        System.out.println("creating an object");
    }
    // public Person(String newName,int newAge){
    //     this();
    //     name=newName;
    //     age=newAge;
    // }
    
    public Person(String name,int age){
        this();
        this.name=name;
        this.age=age;
    }

    
    //! behaviours of class
    void walk(){//! eat method/functions of person class
        System.out.println(name+" is walking alone");
    }
    void struggle(){//! method/fuction of person class
        System.out.println(name+" is struggling now,but its okay");
    }
    
    void steps_walk(int st){//! how many steps name walk=
        System.out.println(name+" walk "+st+" steps");

    //! there are two types of polymorphism
    /*
    !compile time polymorphism
    !runtime polymorphism

    ! consttructor is not a function we can use for make new objects
    */
    }
} 