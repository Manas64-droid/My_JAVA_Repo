package Stack;

import java.util.*;

public class slidingWindowMaximum {
    // static void slidingWindowMaximum1(int arr[],int slidingWindow){
    //     Stack<Integer> st=new Stack<>();
    //     int nextGreater[]=new int[arr.length];
    //     st.push(arr.length-1);
    //     arr[arr.length-1]=arr.length;
        
    //     for(int i=arr.length-2;i>0;i--){
    //         while(st.size()>0 && arr[i]>=arr[st.peek()]){
    //             st.pop();
    //         }
    //         if(st.isEmpty()){
    //             nextGreater[i]=arr.length;
    //         }
    //         else{
    //             nextGreater[i]=st.peek();
    //         }
    //         st.push(i);
    //     }
    //     // return nextGreater;
    //     // int j=0;
    //     for(int i=0;i<arr.length-slidingWindow;i++){
    //         // if(j<i){
    //         int j=i;
    //         // }
    //         while(nextGreater[j]<i+slidingWindow){
    //             j=nextGreater[j];
    //         }
    //         System.out.println(arr[j]);
    //     }
    // }
    public static void main(String[] args) {
        int arr[]={9,44,2,3,6,12,1,115};
        int slidingWindow=4;
        Stack<Integer> st=new Stack<>();
        int nextGreater[]=new int[arr.length];
        st.push(arr.length-1);
        nextGreater[arr.length-1]=arr.length;
        
        for(int i=arr.length-2;i>0;i--){
            while(st.size()>0 && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nextGreater[i]=arr.length;
            }
            else{
                nextGreater[i]=st.peek();
            }
            st.push(i);
        }
        // return nextGreater;
        // int j=0;
        for(int i=0;i<=arr.length-slidingWindow;i++){
            // if(j<i){
            int j=i;
            // }
            while(nextGreater[j]<i+slidingWindow){
                j=nextGreater[j];
            }
            System.out.println(arr[j]+" ");
        }
        // slidingWindowMaximum1(arr, 4);
        
        // System.out.println(Arrays.toString(slidingWindowMaximum1(arr,4)));
    }
}
