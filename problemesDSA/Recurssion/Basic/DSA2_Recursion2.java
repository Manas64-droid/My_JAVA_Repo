package Recurssion;

public class DSA2_Recursion2 {
    public static void printNumbersDessending(int n) throws InterruptedException{
        if(n==0){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        Thread.sleep(1000);
        printNumbersDessending(n-1);
    }

    public static void printNumberAssending(int n) throws InterruptedException{
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        Thread.sleep(1000);
        printNumberAssending(n+1);
    }

    public static int factorial(int n){
        if(n==1 || n==0){
            // System.out.println(n);
            return n;
        }
        return n*factorial(n-1);
    }

    public static int sumAll(int n){
        if(n==0){
            return n;
        }
        if(n==1){
            return n;
        }
        return n+sumAll(n-1);
    }

    public static int sumEntireDigit(int n){
        if(n==0){
            return n;
        }
        // int rem=n%10;
        return (n%10)+sumEntireDigit(n/10);
    }
    public static int productOfEntireDigit(int n){
        if(n==0 || n==1){
            return n;
        }
        return n%10*productOfEntireDigit(n/10);
    }

    public static int reverseNumber(int n){
        int numOfdigit=(int)(Math.log10(n))+1;
        System.out.println(numOfdigit);
        return helper(n, numOfdigit);
    }
    static int helper(int n,int digit){
        if(digit==1){
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10,digit-1))+helper(n/10, digit-1);
    }

    public static int sum=0;
    public static int returnReverseNum(int n){
        if(n==0){
            return n;
        }
        int rem=n%10;
        sum=sum*10+rem;
        returnReverseNum(n/10);
        return sum;
    }
    public static boolean isTrueORFalse(int n){
        return reverseNumber(n)==(n);
    }
    public static void main(String[] args) throws InterruptedException {
        //! Problem No1;
        /*
        printNumbersDessending(10);
        System.out.println();
        printNumberAssending(1);
        //! 0=desending / number that we want =assending
        //! n+1= assending / n-1=desending
        */

        //! Problem No2: Factorial of num;
        /*
        System.out.println(factorial(12));
        */

        //! Problem No2: Sum of nums;
        // System.out.println(sumAll(20));

        //! sum of entire digit
        // System.out.println(sumEntireDigit(1234));

        //! product of all entire digit
        // System.out.println(productOfEntireDigit(123));

        //! reverse number
        // System.out.println(returnReverseNum(66));
        // System.out.println(reverseNumber(159753));

        //! palindrome
        // System.out.println(isTrueORFalse(66));
    }
}
