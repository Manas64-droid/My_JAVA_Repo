import java.util.Arrays;
import java.util.Scanner;



public class linearSearch_Quetions {
    
    static boolean q2S(int a[], int target, int starts, int ends){
        if(a.length==0){
            return false;
        }
        for(int ind=starts;ind<ends;ind++){
            int element1=a[ind];
            if(element1==target){
                return true;
            }
            
        }
        return false;
    }
    static int q3Min(int b[]){
        // if(b.length==0){
        //     return -1;
        // }
        int ans=b[0];
        for(int i=0;i<b.length;i++){
            int element2=b[i];
            if(element2<ans){
                ans=element2;
            }
        }
        return ans;
    }
    static int[] q4(int[][] c,int target){
        for(int row=0;row<c.length;row++){
            for(int col=0;col<c[row].length;col++){
                if(c[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }return  new int[]{-1,-1};
    }
    //! code for finding higher/lower value in array
    static int q4a(int[][] d){
        int ans=d[0][0];
        for(int i=0;i<d.length;i++){
            for(int j=0;j<d[i].length;j++){
                int element3=d[i][j];
                // if(element3<ans){//! code for finding lower value in array
                if(element3>ans){//! code for finding higher value in array
                    ans=element3;
                }
            }
        }return ans;
    }
    //! Q5
    //! even odd digit problem with array 
    static int findNumbers(int n[]){
        int count=0;
        for(int nums:n){
            if(evenOddDigit_Q5(nums)){
                count++;
            }
        }return count;
    }
    static boolean evenOddDigit_Q5(int nums){
        int numberOfDigits=digits_Q5(nums);
        if(numberOfDigits%2==0){
            return true;
        }
        return false;
    }
    static int digits_Q5(int nums){
        int ct=0;
        while(nums>0){
            ct++;
            nums/=10;
        }
        return ct;
    }
    //! Q6
    static int maximumWelth(int[][] account){
        int rowSum=0;
        int ans=0;
        for(int person=0;person<account.length;person++){
            for(int act=0;act<account[person].length;act++){
                int element4=account[person][act];
                rowSum+=element4;
                if(rowSum>ans){
                    ans+=rowSum;
                }
            }
            // now we have sum of counts of peroson
            //! cheak with overall ans
        }return rowSum;
    }
    // static int maxCompare(int n){
    //     if()
    // }
    public static void main(String[] args){
        //! Q2;
        //! find 3 in array's given range
        //! arr={18,12,-7,3,4,28}
        //? find 3 from 12 to 4
        // int arr[]={18,12,-7,3,4,28};
        // System.out.println(q2S(arr, 3,1,4));

        //! Q3;
        //! retun smallest number index or -1/1
        //! Ans:-7
        // int arr1[]={18,12,-7,3,14,28};
        // System.out.println(q3Min(arr1));

        //! Q4
        //! element present in 2D array or not & graater and  smaller valalue in the arrays
        int[][] arr2={
            {12,13,14},
            {14,155,16,89},
            {17,18,19,99},
            {20,21,-1},
        };
        // int ans[]=q4(arr2, 155);
        // System.out.println(Arrays.toString(ans));
        // System.out.println(q4a(arr2));

        //! Q5 
        //! nums=[12,345,2,6,7896] find number of digits and then tell
        //? digit is even or odd
        int nums[]={12,345,2,6,7896};
        System.out.println(findNumbers(nums));

        //! Q6.
        //! welthiest person amoung amoung 2D array
        //! account = {{1,2,3},{3,2,1}}:
        //! 1+2+3=6 & 3+2+1=6
        //! return 6;
        int[][] num1={
            {1,2,3},
            {4,1,6},
            {3,3,7},
        };
        // Scanner sc=new Scanner(System.in);
        System.out.println(maximumWelth(num1));

    }
}
