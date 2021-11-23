package practiceSet;

import java.util.Scanner;

public class CWH_PR3_Q3 {
    public static void main(String[] args) {
        String letter = "Dear <Name>,thanks a lot";

        System.out.print("Enter Name:");
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        
        letter=letter.replaceAll("<Name>",name);
        System.out.println(letter);
        

    }
}
