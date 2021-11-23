package Sort;
public class DSA8_QuikeSort{
    static void QuikeSort(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int i=start;
        int j=end;
        int mid=i+(j-i)/2;
        int pivot=arr[mid];

        while(i<=j){
            while(arr[i]<pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<=j){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j--;
            }

        }
        QuikeSort(arr, start, j);
        QuikeSort(arr, i, end);
    }
    public static void main(String[] args) {
        int arr[]={45,56,5,51,8,66,74};
        QuikeSort(arr, 0, arr.length-1);
        System.out.println(arr.toString());
        for(int k:arr){
            System.out.println(k+" ");
        }

    }
}