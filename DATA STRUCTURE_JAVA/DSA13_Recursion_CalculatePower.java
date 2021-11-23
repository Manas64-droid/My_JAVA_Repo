public class DSA13_Recursion_CalculatePower {
    static int pow(int a,int b){
        
        if(b==0){
            return 1;
        }
        return a*pow(a,b-1);
    }
    public static void main(String[] args) {
        // int stepsCount=0;
        /*
        ? find a^b
        ! exp 3^4=81
        ? if a^0=1
        ? 3^3x3=3^4
        ! pow(a,b) {if 1,b=0 else aXpow(a^b-1)}
        */
        System.out.println(pow(3, 4));
        // System.out.println(stepsCount);
    }
}
