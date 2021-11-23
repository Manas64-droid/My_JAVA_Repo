import java.util.Scanner;
public class UGAM2 {
    public static void main(String[] args) {
        //merge two list and print in dessending order
        Scanner sc=new Scanner(System.in);
        int len1=sc.nextInt();
        int len2=sc.nextInt();

        int arr1[]=new int[len1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        int arr2[]=new int[len2];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        
        int merge[]=new int[arr1.length+arr2.length];
        int c=0;
        for(int j=0;j<arr1.length;j++){
            merge[j]=arr1[j];
            c+=1;
        }
        for(int k=0;k<arr2.length;k++){
            merge[c++]=arr2[k];
        }
        for(int z=0;z<merge.length;z++){
            for(int y=z;y<merge.length;y++)
                if(merge[z]<merge[y]){
                    int temp=merge[z];
                    merge[z]=merge[y];
                    merge[y]=temp;
                }
        }
        System.out.println("Print Output:");
        for (int i : merge) {
            System.out.println(i);
        }
        
    }
}
