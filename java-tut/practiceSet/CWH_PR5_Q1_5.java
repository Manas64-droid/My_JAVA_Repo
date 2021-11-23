package practiceSet;
import java.util.Scanner;
public class CWH_PR5_Q1_5 {
    public static void main(String[] args) {
        /*
        !for printing Q1
        ! ****
        ! ***
        ! **
        ! *
        */
        // int n=4;
        // for(int i=n;i>0;i--) {
        //     for (int j=0;j<i;j++) {
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        //! Q2)even numbers using while loop
        // int sum=0;
        // int i=1;
        // while(i<=10) {
        //     sum=sum+(2*i);
        //     i++;
        // }
        // System.out.println("Sum of first 10 even numbers:"+sum);

        //! Q3) Multiplication tables for given number
        // int n;
        // System.out.print("Enter Number:");
        // Scanner sc= new Scanner(System.in);
        // n=sc.nextInt();
        // for(int i=1;i<=10;i++){
        //     System.out.println(n+"X"+i+"="+n*i);
        // }

        //! Q4) Multiplication table in reverse order
        // int n;
        // System.out.print("Enter Number:");
        // Scanner sc= new Scanner(System.in);
        // n=sc.nextInt();
        // for (int i=10;i>=1;i--) {
        //     System.out.println(n+"X"+i+"="+n*i);
        // }
        
        //! Q5) factorial using for loop
        // int n;// user input uptil number
        // int fact=1;
        // System.out.print("Enter Number:");
        // Scanner sc=new Scanner(System.in);
        // n=sc.nextInt();
        // for (int i=1;i<=n;i++) {
        //     fact=fact*i;
        // }
        // System.out.println("Factorial:"+n+"!="+fact);

        
        // n=sc.nextInt();
        //! Q6) factorial using while loop
        // int n;// user input uptil number
        // int i=1;
        // int fact=1;
        // System.out.print("Enter Number:");
        // Scanner sc=new Scanner(System.in);
        // n=sc.nextInt();
        // while(i<=n){
        //     fact=fact*(i);
        //     i++;
        // }
        // System.out.println("Factorial:"+n+"!="+fact);
        
        //? Q7) pattern printing using while
        // int n=4;
        // int i=n;
        // int j=0;
        // while(0<i) {
        //     while (j<=i) {
        //         System.out.print("*");
        //         j++;
        //     }
        //     System.out.print("\n");
        //     i--;
        // } 

        //! Q8) true

        //! Q9) sum the table 
        // int i=1;
        // int num=8;
        // int sum=0;

        // while(i<=10) {
        //     sum=sum+(i*num);
        //     i++;
        // }
        // System.out.println("Sum of outcomes of table "+num+" is "+sum);
        
        //! Q11)even numbers using for loop
        int num=10;
        for (int i=1;i<=num;i++) {
            System.out.println(2*i);// first 10 even numbers using for loop
        }
    }  
}
