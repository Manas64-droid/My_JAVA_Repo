class MyThreade1 extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("My thread is running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThreade2 extends Thread{
    public void run(){
        int j=0;
        while(j<100){
            System.out.println("My thread2 is running");
            System.out.println("I am sad");
            j++;
        }
    }
}
public class CWH_70 {
    public static void main(String[] args) {
        MyThreade1 th1=new MyThreade1();
        MyThreade2 th2=new MyThreade2();
        th1.start();
        th2.start();

    }
}
