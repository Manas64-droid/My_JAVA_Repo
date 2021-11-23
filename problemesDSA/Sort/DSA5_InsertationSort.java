package Sort;

import java.util.Scanner;

public class DSA5_InsertationSort {
    static void InsertationSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
    static void printArr(int a[]){
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        /*
        ! _ _
        ! _ _ _
        ! _ _ _ _
        ! _ _ _ _ _
        */
        Scanner sc= new Scanner(System.in);
        int e1=sc.nextInt();

        int arr[]=new int[e1];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        printArr(arr);
        InsertationSort(arr);
        System.out.println();
        printArr(arr);
        sc.close();
    }
}
