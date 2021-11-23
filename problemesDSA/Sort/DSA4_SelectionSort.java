package Sort;
// import java.util.Arrays;
public class DSA4_SelectionSort {
    static void SelectionSort(int arr[])
    {
        for(int i=0;i<arr.length;i++){
            int lastIndex=arr.length-1;
            int maxElement=arr[i];
            for(int j=0;j<lastIndex;j++){
                if(arr[maxElement]>arr[lastIndex]){
                    int temp=arr[maxElement];
                    arr[maxElement]=arr[lastIndex];
                    arr[lastIndex]=temp;
                }
            }
        }
    }
    static void selection(int arr[]){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex=getMaxElement(arr,0,last);
            swapElement(arr, maxIndex, last);
        }
    }
    static int getMaxElement(int arr[],int start,int last){
        int max=start;
        for(int i=0;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swapElement(int arr[],int first,int last){
        //
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        /*
        ! select an element and put it on its correct index
        ! done by placing largest element at last or smallest element at fisrt
        ! where largest element comes to last index of array means get swapped
        ! with privous last index element
        */
        int arr[]={8,2,7,10,6,12,3};
        // System.out.print("Before:-");
        // printArray(arr);
        // selection(arr);
        // System.out.print("After:-");
        // printArray(arr);
        // System.out.println();
        selection(arr);
        printArray(arr);
        /*
        Before:-8 2 7 10 6 12 3 
        
        Print Len7
        Print Last>6

        Max> 5
        8 2 7 10 6 12 3
        Print Len7
        Print Last>5

        Max> 3
        8 2 7 10 6 3 12
        Print Len7
        Print Last>4

        Max> 0
        8 2 7 3 6 10 12
        Print Len7
        Print Last>3

        Max> 2
        6 2 7 3 8 10 12
        Print Len7
        Print Last>2

        Max> 0
        6 2 3 7 8 10 12
        Print Len7
        Print Last>1

        Max> 0
        3 2 6 7 8 10 12
        Print Len7
        Print Last>0

        Max> 0
        2 3 6 7 8 10 12

        After:-2 3 6 7 8 10 12
        */
    }
}
