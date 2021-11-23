package CWH_OOPS;

class MyEmploye{
    private int id;
    private String name;
    /*
    private int id;
    private String name;
    
    */
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
}

public class CWH_40_accessModifyers {
    public static void main(String[] args) {
        MyEmploye manas =new MyEmploye();
        // manas.id=6464;
        // manas.name="CodeWithManny";
        //! throw error due to private access modifyers

        manas.setName("CodeWithManny");
        manas.setId(6464);
        
        System.out.println(manas.getName());
        System.out.println(manas.getId());
    }
}
