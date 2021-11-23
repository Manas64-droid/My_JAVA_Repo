import java.util.*;

class Pen{
    int price;
    String colur;
    public Pen(int price,String colur){
        this.price=price;
        this.colur=colur;
    }
    @Override
    public boolean equals(Object obj){
        Pen that=(Pen) obj;
        boolean isEq=this.price==that.price && this.colur==that.colur;
        return isEq;
    }
    @Override
    public int hashCode(){
        return price+colur.hashCode();
        //! s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
    }

}
public class DSA_11_HashCode_and_equals {
    public static void main(String[] args) {
        Pen p1=new Pen(10,"blue");
        Pen p2=new Pen(10,"blue");
        System.out.println(p1.equals(p2));

        Set<Pen> pens=new HashSet<>();
        pens.add(p1);
        pens.add(p2);
        System.out.println(pens);
    }
}
