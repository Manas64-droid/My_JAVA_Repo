package Recurssion.Array;

import java.util.ArrayList;

public class DSA1_Recursion_ArrayProblem {
    static boolean isArraySorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && isArraySorted(arr, index+1);
    }

    static boolean isArrayElementFound(int arr[],int index,int targert){
        if(arr[0]==targert){
            return true;
        }
        return arr[index]==targert || isArrayElementFound(arr, index+1, targert);
    }
    static int printIndex(int arr[],int index,int targert){
        int i=0;
        if(index==arr.length){
            return -1;
        }
        if(targert==arr[index]){
            i=index;
            return index;
            // break;
        }
        printIndex(arr, index+1, targert);
        return i;
    }
    static ArrayList<Integer> arl=new ArrayList<>();
    static void allOccurancesInArray(int arr[],int target,int index){
        if(index==arr.length){
            return;
        }
        if(target==arr[index]){
            arl.add(index);
        }
        allOccurancesInArray(arr, target, index+1);
    }

    static int binarySearch(int arr[],int start,int end,int target){
        // int i=0;
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target<=arr[mid]){
                return binarySearch(arr, start, mid-1, target);
            }
            else{
                return binarySearch(arr, mid+1,end , target);
            }
        }if(target>=arr[mid] && target<=arr[end]){
            return binarySearch(arr, mid+1, end, target);
        }
        return binarySearch(arr, start, mid-1, target);
        
    }
    public static void main(String[] args) {
        //! array is sorteed or not 
        int arr[]={1,2,3,4,15,6,7,8};
        int arr1[]={6,7,8,9,10,1,2,3,4};
        // System.out.println(isArraySorted(arr, 0));

        //! linear search 
        // System.out.println(isArrayElementFound(arr, 0, 15));
        // printIndex(arr, 0, 9);

        //! print all occurances
        // allOccurancesInArray(arr, 6, 0);
        // System.out.println(arl);

        //! binary Search
        System.out.println(binarySearch(arr1, 0, arr.length-1, 3));
    }
}
