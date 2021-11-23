package Excrcise;
import java.util.Scanner;
class exc1 {
    public static void main(String[] args) {
        float sub1;
        float sub2;
        float sub3;
        float sub4;
        float sub5;
        
        System.out.print("Enter Marks Sub1:");
        Scanner sc1 = new Scanner(System.in);
        sub1=sc1.nextInt();

        System.out.print("Enter Marks Sub2:");
        Scanner sc2 = new Scanner(System.in);
        sub2=sc2.nextInt();

        System.out.print("Enter Marks Sub3:");
        Scanner sc3 = new Scanner(System.in);
        sub3=sc3.nextInt();

        System.out.print("Enter Marks Sub4:");
        Scanner sc4 = new Scanner(System.in);
        sub4=sc4.nextInt();

        System.out.print("Enter Marks Sub5:");
        Scanner sc5 = new Scanner(System.in);
        sub5=sc5.nextInt();

        // System.out.print("Your Persentages Are:");
        float result=(sub1+sub2+sub3+sub4+sub5)/5f;
        System.out.print("CGPA:"+result/10+"/10");
    }
}
