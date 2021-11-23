public class CWH_chp7_Methods {
    static int logic(int v,int y){
        int z;
        if (v>y){
            z=v+y;
        }else{
            z=(v+y)*2;
        }
        return z;
    }
    public static void main(String[] args) {
        //logic into method//!--> function=method
        int a,b,c;
        a=3;
        b=4;
        //! first method
        c=logic(a,b);//! first method with static class with function !!


        //!second method 
        // CWH_chp7_Methods obj=new CWH_chp7_Methods();//! without static keyword
        // c=obj.logic(a, b);

        System.out.println(c);
        System.out.println(a+" "+b);//! class value remain same
        

    }
}
