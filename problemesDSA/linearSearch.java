import java.util.Arrays;

public class linearSearch {
    //! search in the array return the index if item found
    //! otherwise return -1
    //! Q2
    static int linearsearch(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0;index<arr.length;index++){
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
    static boolean linearsearch1(int arr[], int target){
        if(arr.length==0){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            int e=arr[i];
            if(e==target){
                return true;
            }
        }
        return false;
    }
    static boolean linearsearch2(String n,char target){
        if(n.length()==0){
            return false;
        }
        for(int ind=0;ind<n.length();ind++){
            if(target==n.charAt(ind)){
                return true;
            }
        }
        return false;
    }
    static boolean linearsearch3(String n, char target){
        if(n.length()==0){
            return true;
        }
        for(char ch: n.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String name="Manas";
        System.out.println(Arrays.toString(name.toCharArray()));
        int num[]={12,13,45,78,65,75,11};
        System.out.println(linearsearch(num, 64));
        System.out.println(linearsearch1(num, 45));
        System.out.println(linearsearch2(name,'s'));
        System.out.println(linearsearch3(name, 's'));
        
    }
}
