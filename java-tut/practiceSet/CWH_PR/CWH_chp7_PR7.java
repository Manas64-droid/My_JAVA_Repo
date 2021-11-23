package practiceSet.CWH_PR;

import java.util.Scanner;

public class CWH_chp7_PR7 {
    static void mulTab(int n){
        int mul=1;
        for(int i=1;i<=10;i++){
            mul=i*n;
            System.out.println(n+"X"+i+"="+mul);
        }
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
    static int natNum(int n){
        int sum=0;
        sum=n*(n+1)/2;
        return sum;
    }
    static void patter2(int n){
        for(int i=n;i>=0;i--){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }System.out.println("");
        }
    }
    static int fib(int n){
        int result;
        result=fib(n-1)+fib(n-2);
        return result;
    }
    static float avg(float...arr){
        float sum=0;
        float avrage=0;
        // float avrage;
        for(float num:arr){
            sum=sum+num;
            avrage=sum/arr.length;

        }
        return avrage;
    }
    static float cTof(float c){
        float cal;
        float far;
        far=(c*1.800f)+32.00f;
        return far;
    }
    static float fToc(float f){
        float cal;
        cal=(f-32.0f)/1.8000f;
        return cal;
    }
    public static void main(String[] args) {
        // mulTab(5);

        // pattern(5);
        
        // System.out.println(natNum(3));
        
        // patter2(4);

        // System.out.println(fib(7));
        
        // System.out.println("Avrage:"+avg(56,66,64,15));

        // System.out.print("1.Celsius to farhrenheit\n2.Farhrenheit to Celsius\nEnter choice:");
        // int choice;
        // Scanner sc=new Scanner(System.in);
        // choice =sc.nextInt();
        
        // System.out.print("Enter temprature:");
        // float temp_choice;
        // Scanner sc1=new Scanner(System.in);
        // temp_choice=sc1.nextFloat();

        // switch(choice){
        //     case 1:
        //         if(choice==1){
        //             System.out.println(temp_choice+"◦C="+cTof(temp_choice)+"◦F");
        //         }
        //     case 2:
        //         if(choice==2){
        //             System.out.println(temp_choice+"◦F="+fToc(temp_choice)+"◦C");
        //         }
        // }



        
    }
}
