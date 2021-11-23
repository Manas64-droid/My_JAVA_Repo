package CWH_Practice_Set;
class Practice13_gm extends Thread{
    public void run(){
        int i=0;
    while(i<5){
        System.out.println("Good Morning Manny...");
        // try {
        //     Thread.sleep(2000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        i++;
    }

    }
}
class Practice13_wlc extends Thread{
    public void run(){
        int i=0;
    while(i<5){
        System.out.println("Welcome Manny....");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i++;
    }

    }
}
public class CWH_76_Chp13_PR13 {
    public static void main(String[] args) {
        Practice13_gm gm= new Practice13_gm();
        Practice13_wlc wlc= new Practice13_wlc();
        // gm.setPriority(10)
        // wlc.setPriority(5);
        gm.start();
        try{
            gm.join();
        }catch(Exception e){
            System.out.println(e);
        }
        wlc.start();
        System.out.println(wlc.getState());
        System.out.println(Thread.currentThread().getState());
        

    }
}
