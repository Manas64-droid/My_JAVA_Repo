package practiceSet.CWH_PR;
import java.util.Scanner;
public class CWH_PR3_Q4 {
    public static void main(String[] args) {
        int year;
        System.out.print("Enter Year:");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        // System.out.println(year);

        if (year%4==0) {
            if (year%100==0) {
                if (year%400==0){
                    System.err.println("Leap Year");
                } else {
                    System.out.println("Not Leap Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not Leap Year");
        }
        // System.out.println("_"+year%4);
        // System.out.println("__"+year%400);
        // System.out.println(year/4);
        System.out.println(year%4);
        System.out.println(year%100);
        System.out.println(year%400);
    }
}

