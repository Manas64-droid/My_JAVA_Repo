import java.util.Scanner;
public class encasulation {

    // static void toDoo(){
    //     System.out.println("Working..bro");
    // }
    public static void main(String[] args) {
        // toDoo();
        // laptop l1=new laptop();
        // l1.price=30000;
        // System.out.println(l1.price);
        // int verify;
        // Scanner sc=new Scanner(System.in);
        // verify=sc.nextInt();
        laptop l1=new laptop();
        
        l1.setPrice(31);
        System.out.println(l1.getPrice());

        
        

    }
    
    public void toDo(){
        System.out.println("Working..bro");
        /*
        !when we write public then we can access fucntion 
        !of onother files/?packages--> we can also;
        
        ! private insted of public -->then the functions is private
        ! for present class
        */
    }

}    
class laptop{
    String name;
    int ram;
    // private int pass=6464;
    private int price;

    public void setPrice(int price){
        // int verify=9696;
        // System.out.print("Enter Password:");
        // Scanner sc=new Scanner(System.in);
        // verify=sc.nextInt();
        boolean pass=false;
        if(!pass){
            System.out.println("no access");
        }else{
            this.price=price;
        }
    }
    public int getPrice(){
        return price;
    }
}
