package practiceSet;

import java.util.Scanner;

import javax.print.event.PrintJobListener;

public class CWH_PR1_4 {
    public static void main(String[] args) {
        System.out.println("----Kilometers to miles convertor----");
        float dist = 0.612f;
        float a;
        System.out.print("Enter Kilometers: ");
        Scanner sc = new Scanner(System.in);    
        a = sc.nextFloat();
        System.out.println("Miles:"+a*dist);
    }
}
