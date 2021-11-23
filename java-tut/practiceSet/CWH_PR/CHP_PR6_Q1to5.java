package practiceSet.CWH_PR;
import java.util.Scanner;


public class CHP_PR6_Q1to5 {
    public static void main(String[] args) {
        //! Q1)write program to store 5floates and return thire sum
        // float sum=0;
        // float flt[]={89.2f,79.5f,77.06f,64.4f,80.1f};
        // for (int i=0;i<flt.length;i++){
        //     sum=sum+(flt[i]);

        // }
        // System.out.println(sum);

        //! Q2)given integer present in array or not
        // int num;//user input  
        // int lst[]={89,88,45,100,646,44,55};//list or array
        // boolean yesOrno=false;//to cheak number is present or not in array
        

        // System.out.print("Enter Int:");
        // Scanner sc= new Scanner(System.in);
        // num=sc.nextInt();//take user input

        // for(int i=0;i<lst.length;i++){
        //     //!cheaking enter number present in string or not
        //     if (num==lst[i]){
        //         yesOrno=true;//! if present return true
        //         break;
        //     } else {
        //         yesOrno=false;//! else return false 
        //     }

        // } if (yesOrno==true){
        //     System.out.println("number is present");//! if true present  
        // } else{
        //     System.out.println("number is not present");//! if false not present

        // }
        
        //! Q3) calculate avg of array containg student marks useing for each loop

        // int marks[]={78,89,64,46,73,96};
        // int avg=marks.length;
        // float sum=0;
        
        // for(float elements:marks){
        //     sum=sum+elements;
            
        // }
        // System.out.print("Avrage:"+sum/avg);

        //! Q4)creat an 2D array with 2rows 3colums
        // int [][]mat1={{1,2,3},{4,5,6}};
        // int [][]mat2={{1,8,3},{9,7,6}};
        // int [][]result_mat={{0,0,0},{0,0,0}};

        // for (int i=0;i<mat1.length;i++){ //! run row number of times-2
        //     for (int j=0;j<mat1[i].length;j++){ //! run column number of times-3
        //         result_mat[i][j]=mat1[i][j]+mat2[i][j];//! store and value of both matix
        //         System.out.print(result_mat[i][j]+" ");//! print result

        //     }System.out.println("");//! print new line after one row
        //}

        //! Q5)reverse the array
        // int i[]={54,58,66,87,22};
        // for(int j=i.length-1;j>0;j--){
        //     System.out.println(i[j]);
        // }
        //! Q6)maimum element in array
        // int large=-2147483647;
        // int lst[]={88,22,55,99,0,44,66,5};
        // System.out.println("Maimum "+lst.length+" Numbers In Array");
        // for (int e: lst){
        //     if (e>large){
        //         large=e;
        //     }
        // }System.out.println(large);

        //! Q6)Minimum element in array
        // int large=2147483647;
        // int lst[]={88,22,55,1,0,99,-1,44,66,5};
        // // System.out.println("Maimum "+lst.length+" Numbers In Array");
        // for (int i=0;i<lst.length;i++){
        //     if (lst[i]<large){
        //         large=lst[i];
        //         // break;
        //     }
        // }
        // System.out.println("Minimum "+large+" Number in Array");
        
        //!Integer can contain uptill
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);
        
        //! Q7)array is sorted or not (numbers inincresing format 1..2..3..4..etc)
        // boolean isTrue=false;
        int lst[]={1,12,3,4,55,6};
        // int large=Integer.MAX_VALUE;
        boolean cheak=true;
        for (int i=0;i<lst.length-1;i++){
            if(lst[i]>lst[i+1]){
            cheak=false;
            break;
            }
        }if (cheak==true){
            System.out.println("Array is sorted");
        }else {
            System.out.println("Array is not sorted");

        }
    }
}
