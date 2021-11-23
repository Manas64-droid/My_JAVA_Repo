import java.util.Scanner;

public class CWH_chp4_elif 
{
    public static void main(String[] args, int i) {
        int exp ;
        System.out.print("Enter Your Experience:");
        Scanner sc = new Scanner(System.in);
        exp = sc.nextInt();
        //System.out.println(exp);
        if (exp>=10){
            System.out.println("you have atleast 10 year experience..ohh");
        } else if (exp>=5){
            System.out.println("you have atleast 5 year experience..ohh");
        } else if (exp>=3){
            System.out.println("you have atleast 3 year experience..ohh");
        } else if (exp>=i){
            System.out.println("you have atleast 2 year experience..ohh");
        } else {
            System.out.println("You have 0 year experience");
        }
    }
}
