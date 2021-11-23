package Sort;
public class DSA3_Bubble_Sort {

    void bubbleSort(int arr[])
    {
        
        int len=arr.length-1;
        
        for(int i=0;i<len;i++){ 
            boolean isSwapped=false;
            for(int j=0;j<len-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(isSwapped==false){
                break;
            }
        }
    }

    void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        /*
        ! first elment get compaired with next element 
        ! if first element is greater than next element 
        ! it will get swapped otherwise order remain same
        */
        DSA3_Bubble_Sort obj=new DSA3_Bubble_Sort();
        int a[] = {64, 34, 25, 12, 22, 11, 90};
        obj.printArray(a);
        System.out.println("    Unsorted Vs Sorted      ");
        obj.bubbleSort(a);
        obj.printArray(a);

    }
}
