
import java.util.Scanner;
public class CWH_chp7_recuersion {
    //! recursion
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    //! itrative method
    static int fact_itrative(int n){
        int fact=1;
        for (int i=1;i<=n;i++){
            if (i==0 || i==0){
                return 1;
            }else{
                fact=fact*i;
            }
        }return fact;
    }

    public static void main(String[] args) {
        int num;
        System.out.print("Enter Number:");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();

        System.out.println("Factorial by recursion:"+fact(num));
        System.out.println("Factorial by itrative:"+fact_itrative(num));
    }
}
