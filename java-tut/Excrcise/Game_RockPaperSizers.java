package Excrcise;
import java.util.Scanner;
import java.util.Random;
public class Game_RockPaperSizers {
    public static void main(String[] args) {
        int choise;
        int comp;
        //take user input and save in choice var
        System.out.print("1.Rock\n2.Paper\n3.Secissor\nEnter Choice:");
        Scanner sc= new Scanner(System.in);
        choise=sc.nextInt();
        // System.out.println(choise);
        
        //! To genrate random number between 1-3
        Random rand= new Random();
        comp=rand.nextInt(4);
        // System.out.println(comp);


        //! switch cases for player
        switch(choise){
            case 1:
                if (comp==0) {
                    System.out.println("Enter Number Again Sorry..!");
                } else if (comp==3) {
                    System.out.println("Computer choose Secissor....You Win");
                } else if (comp==2) {
                    System.out.println("Computer choose paper....You Loss");
                }
                break;
            case 2:
                if (comp==0) {
                    System.out.println("Enter Number Again Sorry..!");
                } else if (comp==1) {
                    System.out.println("Computer choose Rock....You Win");
                } else if (comp==3) {
                    System.out.println("Computer choose Secissor....You Loss");
                }
                break;
            case 3:
                if (comp==0) {
                    System.out.println("Enter Number Again Sorry..!");
                } 
                else if (comp==2) {
                    System.out.println("Computer choose paper....You Win");
                } else if (comp==1) {
                    System.out.println("Computer choose Rock....You Loss");
                }
                break;
            default:
                System.out.println("Enter Number between 1-3 Only");
        }
    }
}
