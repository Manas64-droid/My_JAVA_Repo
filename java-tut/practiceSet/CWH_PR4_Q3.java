package practiceSet;
import java.util.Scanner;
public class CWH_PR4_Q3 {
    public static void main(String[] args) {
        float income;
        float tax=0.0f;

        System.out.print("Enter your income in lakhs:");
        Scanner sc= new Scanner(System.in);
        income=sc.nextFloat();
        // System.out.println(income);

        if(income<=2.5) {
            tax=tax+0.f;
            // System.out.println("Tax:"+tax);
        } else if (income>2.5f && income<=5f){
            tax=tax+0.5f*(income-2.5f);
            // System.out.println("Tax:"+tax);
        } else if (income>5f && income<=7.5f){
            tax=tax+0.5f*(5.0f-2.f);
            tax=tax+0.1f*(income-5f);
            // System.out.println("Tax:"+tax);
        } else if (income>7.5f && income<=10f){
            tax=tax+0.5f*(5.0f-2.f);
            tax=tax+0.1f*(7.5f-5f);
            tax=tax+0.15f*(income-7.5f);
            // System.out.println("Tax:"+tax);
        } else if (income>10f && income<=12.5f){
            tax=tax+0.5f*(5.0f-2.f);
            tax=tax+0.1f*(7.5f-5f);
            tax=tax+0.15f*(10.0f-7.5f);
            tax=tax+0.2f*(income-10);
            System.out.println("Tax:"+tax);
        } else if (income>12.5f && income<=15f){
            tax=tax+0.5f*(5.0f-2.f);
            tax=tax+0.1f*(7.5f-5f);
            tax=tax+0.15f*(10.0f-7.5f);
            tax=tax+0.2f*(12.5f-10);
            tax=tax+0.25f*(income-12.5f);
            // System.out.println("Tax:"+tax);
        } else if (income>15f){
            tax=tax+0.5f*(5.0f-2.f);
            tax=tax+0.1f*(7.5f-5f);
            tax=tax+0.15f*(10.0f-7.5f);
            tax=tax+0.2f*(12.5f-10);
            tax=tax+0.25f*(15.0f-12.5f);
            tax=tax+0.3f*(income-15f);
            // System.out.println("Tax:"+tax);
        }
        System.out.println(tax);
    }
}
