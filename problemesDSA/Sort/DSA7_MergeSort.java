package Sort;

import java.util.Arrays;

public class DSA7_MergeSort {
    static int[] mergeSort(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int left[]=mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int right[]=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }
    static int[] merge(int first[],int[] second){
        int mergeA[]=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){ //! deceending/assending
                mergeA[k]=first[i];
                i++;
            }
            else{
                mergeA[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mergeA[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mergeA[k]=second[j];
            j++;
            k++;
        }
        return mergeA;
    }

    static void mergeSortInplace(int arr[],int start,int end){
        if(end-start==1){
            return;
        }
        int mid=(start+end)/2;
        mergeSortInplace(arr, start, mid);
        mergeSortInplace(arr, mid, end);
        mergeInplace(arr,start,mid,end);
    }
    static void mergeInplace(int arr[],int start,int mid,int end){
        int mergeA[]=new int[end-start];
        int i=start;
        int j=mid;
        int k=0;
        while(i<mid && j<end){
            if(arr[i]<arr[j]){ //! deceending/assending
                mergeA[k]=arr[i];
                i++;
            }
            else{
                mergeA[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            mergeA[k]=arr[i];
            i++;
            k++;
        }
        while(j<end){
            mergeA[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0;l<mergeA.length;l++){
            arr[start+l]=mergeA[l];
        }
        // return mergeA;
    }
    public static void main(String[] args) {
        int arr[]={8,5,9,44,6,1,18};
        // arr=mergeSortInplace(arr,0,arr.length);

        mergeSortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
        // for(int k: arr){
        //     System.out.print(k+" ");
        // }
    }
}
