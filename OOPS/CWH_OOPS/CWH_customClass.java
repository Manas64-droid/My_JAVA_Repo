package CWH_OOPS;


class Employe{
    int id;
    String name;
    int salary;

    public void infoPrint(){
        System.out.println("Employe Name:"+name+"\nEmploye ID:"+id);
    }
    public int getSalary(){
        return salary;
    }
}
public class CWH_customClass {
    public static void main(String[] args) {
        Employe e1=new Employe();
        e1.name="manas";//! setting attribute/properties
        e1.id=646446;//! setting attribute/properties
        e1.salary=25000;

        // System.out.println("My name is "+e1.name);
        // System.out.println("My identity is "+e1.id);

        e1.infoPrint();
        System.out.println(e1.getSalary());
        
        
    }
}
