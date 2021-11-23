package CWH_OOPS.Exc;
class Pattern1{
    public void pat1(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public void pat2(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public void pat3(){
        for(int i=4;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public void pat4(){
        int n=4;
        for(int i=1;i<=n;i++){
            for (int j=1;j<n-1;j++){
                System.out.print(" ");
            }
            for (int k=1;k<n-i+1;k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
public class ApniKaksha {
    public static void main(String[] args) {
    Pattern1 p1= new Pattern1();
    // p1.pat1();
    // p1.pat2();
    // p1.pat3();
    p1.pat4();
    }
    // Pattern1 p1= new Pattern1();
    
}
