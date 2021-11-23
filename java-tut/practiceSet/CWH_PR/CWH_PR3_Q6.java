package practiceSet.CWH_PR;
import java.util.Scanner;
public class CWH_PR3_Q6 {
    public static void main(String[] args) {
        //! System.out.println(str.endsWith("as"));
        String str;
        Scanner sc = new Scanner(System.in);
        str=sc.nextLine();

        if (str.endsWith(".com")) {
            System.out.println("Commertial Website");
        } else if  (str.endsWith(".org")) {
            System.out.println("Orgnisation Website");
        } else if (str.endsWith(".in")) {
            System.out.println("Indian Website");
        }
    }
    
    
}
