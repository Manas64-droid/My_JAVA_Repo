package Search;
public class DSA1_linearSearch {
    static int linearSearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            int store=arr[i];
            if(store==target){
                return i;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int arr[]={45,22,8,99,4,5,101};
        int target=99;
        System.out.println(linearSearch(arr, target));
    }
}
