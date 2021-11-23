public class DSA13_Recurssion_prb1 {

    static int sum(int n){
        if(n==1){//! base caase
            return 1;
        }
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        //! find the sum of n natural numbers
        /*
        1+2+3+4+5=15
        with recurssion
        ! step1: find the base case
        ? 1) n=1 sum(1)=1
        ? 2) sum(4)+5= sum(5)
        ? 3) Genrlize solution
        ! sum(n)={ 1, n=1 l else n+sum(n-1)}
        }
        */
        System.out.println(sum(5));

    }
}
