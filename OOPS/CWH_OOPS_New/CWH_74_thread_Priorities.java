package CWH_OOPS_New;
class MyNewThr extends Thread{
    public MyNewThr(String name){
        super(name);
    }
    public void run(){
        int i=0;
        // System.out.println("Thanks");
        while(i<1){
            System.out.println("Iam thread->"+this.getName()+"_id: "+this.getId());
            i++;
        }
    }
}
public class CWH_74_thread_Priorities {
    public static void main(String[] args) {
        MyNewThr thr1=new MyNewThr("Th1");
        MyNewThr thr2=new MyNewThr("Th2");
        MyNewThr thr3=new MyNewThr("Th3");
        MyNewThr thr4=new MyNewThr("Th4");
        MyNewThr thr5=new MyNewThr("Th5");
        thr5.setPriority(Thread.MAX_PRIORITY);//! 10
        thr1.setPriority(Thread.MIN_PRIORITY);//! 1
        thr3.setPriority(Thread.NORM_PRIORITY);//! 5
        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        thr5.start();
        
    }
}
