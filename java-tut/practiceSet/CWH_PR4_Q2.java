package practiceSet;
import java.util.Scanner;
public class CWH_PR4_Q2 {
    public static void main(String[] args) {
        float sub1, sub2, sub3, sub4, avg;

        //user input for first subjet
        System.out.print("Enter 1st Subject marks:");
        Scanner sc1= new Scanner(System.in);
        sub1=sc1.nextFloat();
        // System.out.println(sub1);

        //user input for second subject
        System.out.print("Enter 2nd Subject marks:");
        Scanner sc2=new Scanner(System.in);
        sub2=sc2.nextFloat();

        //user input for second subject
        System.out.print("Enter 3rd Subject marks:");
        Scanner sc3=new Scanner(System.in);
        sub3=sc3.nextFloat();

        //user input for second subject
        System.out.print("Enter 4th Subject marks:");
        Scanner sc4=new Scanner(System.in);
        sub4=sc4.nextFloat();

        //suming and cheaking percetages
        avg=(sub1+sub2+sub3+sub4)/4.0f;
        if (avg>=40 && sub1>=33.0f && sub2>=33.0f && sub3>=33.0f && sub4>=33.0f){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // System.out.println(sum);

    }
}
