import java.util.Scanner;
public class CWH_SwichCase
{
    public static void main(String[] args)
    {
        String str = "Manas";
        int age ;
        char gd='A';
        System.out.print("Enter your age:");
        Scanner sc = new Scanner(System.in);
        age=sc.nextInt();
        // System.out.println(str);
        switch(age){
            /* 
            the (age) would be also an charachter,String,int
            age will be also replace with charachter,String
            */
            case 10:{
                System.out.println("You are kid");
                System.out.println("You are kid1");
                System.out.println("You are kid2");
            }
                break;
            case 20:
                System.out.println("You are teenager");
                break;
            case 25:
                System.out.println("You are adult");
                break;

            // case "Manas":
            //     System.out.println("Hello"+str);
            //     break;
            // case 'A':
            //     System.out.println("Hello there");

            default:
                System.out.println("Enjoy your life");
            
        }

    }
}
