package Recurssion;

public class DSA3_Recursion3_Fibo {
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void fibo1(int n){
        if(n==0 || n==1){
            System.out.println(n);
        }
        int fib1=fibo(n-1);
        int fib2=fibo(n-2);
        System.out.println(fib1+fib2);
    }
    public static void main(String[] args) {
        System.out.println(fibo(8));
        fibo1(10);
    }
}
