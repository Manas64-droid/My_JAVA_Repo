import java.util.*;
public class helloworld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();
        String fix="Var1_abc";
        boolean areEul=inp.equals(fix);
        
        if(areEul){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
}
