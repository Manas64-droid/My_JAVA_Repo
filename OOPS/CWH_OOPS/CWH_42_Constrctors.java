package CWH_OOPS;

class MyMainEmploye{
    private int id;
    private String name;
    /*
    private int id;
    private String name;
    
    */

    //! constructor default
    public MyMainEmploye(){
        id=64;
        name="ManasJi";
    }
    //! constructor with arguments
    public MyMainEmploye(int Id,String empName){
        id=Id;
        name=empName;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id=i;
    }
    public void printInfo(){

    }
}
public class CWH_42_Constrctors {

    public static void main(String[] args) {
        //MyMainEmploye manny=new MyMainEmploye(64, "Dr.Manny");
        MyMainEmploye manny=new MyMainEmploye();
        //! if id & name is not seted then constructor run  
        //! with default parameters if seted then print those
        //! setters value
        manny.setName("Manny JI");
        manny.setId(6464);

        System.out.println(manny.getName());
        System.out.println(manny.getId());
    }
}
