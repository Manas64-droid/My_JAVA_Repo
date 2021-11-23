package practiceSet.CWH_PR;
import java.util.Scanner;
public class CWH_PR3_Q4_1 {
    public static void main(String[] args) {
        int num;
        //! taking user input for number
        System.out.print("Enter Number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        //! Switch cases 
        switch(num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wenesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Satarday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter Number Between 1-7");

        }

    }
}
