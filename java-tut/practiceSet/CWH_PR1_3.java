package practiceSet;

import java.util.Scanner;

public class CWH_PR1_3 {
    public static void main(String[] args) {
        String str;
        System.out.print("Enter Website name/URL:");
        Scanner sc= new Scanner(System.in);
        str=sc.nextLine();
        // System.out.println(str);

        if (str.endsWith(".com")) {
            System.out.println("Commertial Website");
        } else if (str.endsWith(".org")) {
            System.out.println("Orgnization Website");
        } else if (str.endsWith(".in")) {
            System.out.println("Indian Website");
        } 

    }
}
