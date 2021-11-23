public class binarySearch {

    // return the index
    //! RETURN -1 if item is not present
    static int binySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            //! find the middle element
            // int mid=(start+end)/2;//! might be possible start+end exceeds range of Integer in java
            int mid=start+(end-start)/2; //! it dont exceeds range of Integer in java
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                return mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        /*
        optimize search technique
        used for sorted array array will be in assnding or desending order 
        but it is sorted array
        based on median of array
        ! why binary search
        ! we get ans very fast
        ! for best case if size is incresing then time remians the constatnt O(1)
        ? for worst case find the  max number of search comparisons
        N
        N/2
        N/4
        N/8
        N/16
        .
        .
        .
        .
        1
        ? k^th level=N/2^K -->
        ! log(N)=log(2^k)
        ! logN=Klog2
        ! k=logN/log2 --> k=log2N
        */
        //! sorted array is input of fuction 
        int[] arrO={-6,0,5,6,11,13,14};
        System.out.println(binySearch(arrO,4));
    }
}
