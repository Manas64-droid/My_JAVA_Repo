package Recurssion.Array;

import java.util.Arrays;


public class DSA3_Recursion_SelctionSort {
    static void SelctionSort(int arr[],int start,int len,int max){
        if(len==0){
            return;
        }
        if(start<len){
            if(arr[start]>arr[max]){
                SelctionSort(arr, start+1, len, start);
            }
            else{
                SelctionSort(arr, start+1, len, max);
            }
        }
        else{
            int temp=arr[max];
            arr[max]=arr[len-1];
            arr[len-1]=temp;
            SelctionSort(arr, 0, len-1, 0);
        }

    }
    public static void main(String[] args) {
        int arr[]={55,1,2,3,64,9};
        // System.out.println(getMaxElement(arr));
        SelctionSort(arr, 0, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }
}
