package Search;
public class DSA2_BinarySearch {
    static int binSearch(int arr[],int target_element){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;

        while(start<end){
            if(target_element<arr[mid]){
                start=mid+1;
            }
            else if(target_element>arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55,66,77,88,99};
        // System.out.println(binSearch(arr,22));
    }
}
