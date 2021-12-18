package AnujBhaiya;
import java.util.*;
public class HashSet_Problem {
    public static void subArraySum(int arr[],int sum){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]+arr[i]==sum){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        //! problem no.1 
        // int arr[]={5,10,5,4,5,10};
        // int rep=0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]==arr[j]){
        //             System.out.print(arr[j]+" ");
        //             rep+=1;
        //             break;
        //         }
        //     }
        // }
        // int arr1[]={5,10,5,4,5,10};
        // for(int i=0;i<arr.length;i++){
        //     hs.add(arr1[i]);
        // }
        // System.out.println("\n"+hs.size());
        // System.out.println(rep);

        //! problem no.2 Union
        // int arr1[]={5,10,15,5};
        // int arr2[]={10,15,4,5};
        // for(int i=0;i<arr1.length;i++){
        //     hs.add(arr1[i]);
        // }
        // for(int j=0;j<arr2.length;j++){
        //     hs.add(arr2[j]);
        // }
        // System.out.println(hs.size());

        //! Problem intersection
        // int arr1[]={1,2,3};
        // int arr2[]={2,3,4};
        // int count=0;
        // for(int E:arr1){
        //     hs.add(E);
        // }
        // for(int E:arr2){
        //     if(hs.contains(E));
        //     count++;
        //     hs.remove(E);
        // }
        // System.out.println(count);

        //! sub Array Problem
        int arr[]={10,15,-5,15,-10,5};
        int sum=5;
        subArraySum(arr,sum);
    }
}

