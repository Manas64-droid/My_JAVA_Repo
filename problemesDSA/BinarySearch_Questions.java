public class BinarySearch_Questions {
    static int findSmallLetter(char letters[],int target){
        // char letters[]={'c','f','j'};
        int start =0;
        int end=letters.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                mid=end-1;
            }
            else{
                start=mid+1;
            }
        }return letters[start%letters.length];
    }
    public static void main(String[] args) {
        //! smalllest lettter
        char l[]={'c','f','j'};
        // System.out.println(letters.length);
        System.out.println(findSmallLetter(l, 'c'));
    }
}
