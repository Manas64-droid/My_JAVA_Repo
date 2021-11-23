package CWH_OOPS.Exc;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int randomNum;
    public int input;
    public int noGuesses;

    public Game(){
        Random rand = new Random();
        this.randomNum=rand.nextInt(100);
    }
    public void takeUserInput(){
        // int ip;
        System.out.println("Enter Number(1-100)");
        Scanner sc=new Scanner(System.in);
        this.input=sc.nextInt();
        // return input;
    }
    public boolean isCorrectNumber(){
        if(input<randomNum){
            System.out.println("Too low..");
        }else if(input>randomNum){
            System.out.println("Too high..");
        }
        else if(input==randomNum){
            return true;
        }
        return false;
    }
    public void playSrart(){
        System.out.print("Enter Number(0-10)");
    }
    public int getScore(){
        return noGuesses;
    }
    public void setScore(int noGuesses){
        this.noGuesses=noGuesses;
    
    }
}

public class CWH_E3_43 {
    public static void main(String[] args) {
        int i=0;
        Game newGame=new Game();
        boolean t=false;
        while(!t){
            newGame.takeUserInput();
            t=newGame.isCorrectNumber();
            System.out.println(t);
            i++;
        }
        newGame.setScore(i);
        System.out.format("Congratulations...\nYou Crack This In %d Guesses",newGame.getScore());
        

    }
}
