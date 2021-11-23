package CWH_OOPS_New;
class MyThr123 extends Thread{
    public void run(){
        int i=0;
        while(i<5){
            System.out.println("Thanks");
            // System.out.println("Iam thread Id->"+this.getId());
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
class MyThr1234 extends Thread{
    public void run(){
        int i=0;
        while(i<5){
            System.out.println("Thanks Harry....");
            // System.out.println("Iam thread Id->"+this.getId());
            i++;
        }
    }
}
public class CWH_75_Thread_Methods {
    public static void main(String[] args) {
        MyThr123 thr123 =new MyThr123();
        MyThr1234 thr1234 =new MyThr1234();
        thr123.start();
        try{
            thr123.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        thr1234.start();
    }
}
