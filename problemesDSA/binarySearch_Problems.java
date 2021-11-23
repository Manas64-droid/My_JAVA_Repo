
public class binarySearch_Problems {
    static int celing(int arr[],int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(target <arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }

    static int floor(int arr[],int target){
        // if(target<arr[arr.length-1]){
        //     return -1;
        // }
        int start=0;
        int end=arr[arr.length-1];
        int mid=start+(end-start)/2;
        while(start<=end){
            if(target<mid){
                end=mid-1;
            }
            else if(target>mid){
                end=mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        // System.out.println(arr[arr.length-1]);
        // System.out.println(floor(arr, 14));
        System.out.println(celing(arr,15));
        System.out.println(floor(arr,15));
    }
    
}
