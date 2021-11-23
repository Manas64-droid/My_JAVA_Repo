package Recurssion.Array;

import java.util.Arrays;
public class DSA2_Recursion_BubbuleSort {
    static void BubbuleSort(int arr[],int c,int r){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                //swap
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            BubbuleSort(arr, c+1, r);
        }
        else{
            BubbuleSort(arr, 0, r-1);
        }
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        BubbuleSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
