package CWH_OOPS_New;
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i=0;
        System.out.println("Thanks");
        // while(i<10){
        //     System.out.println("Iam thread");
        //     i++;
        // }
    }
}
public class CWH_73_thread_constructor {
    public static void main(String[] args) {
        MyThr t1=new MyThr("Manny");
        MyThr t2=new MyThr("Pooja");
        t1.start();
        t2.start();
        System.out.println("Thread id:"+t1.getId());
        System.out.println("Thread id:"+t2.getId());
        System.out.println("Thread id:"+t1.getName());
        System.out.println("Thread id:"+t2.getName());
    }
}
