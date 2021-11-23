class MyThreadeRunnable1 implements Runnable{
    public void run(){
        System.out.println("Jai Hind");
        System.out.println("Jai Hind");
        System.out.println("Jai Hind");
        System.out.println("Jai Hind");
        System.out.println("Jai Hind");
        System.out.println("Jai Hind");
        System.out.println("Jai Hind");
        System.out.println("Jai Hind");
        System.out.println("Jai Hind");
        System.out.println("Jai Hind");
        System.out.println("Jai Hind");
        System.out.println("Jai Hind");
        System.out.println("Jai Hind");
    }
}
class MyThreadeRunnable2 implements Runnable{
    public void run(){
        System.out.println("Jai Hindustan");
        System.out.println("Jai Hindustan");
        System.out.println("Jai Hindustan");
        System.out.println("Jai Hindustan");
        System.out.println("Jai Hindustan");
        System.out.println("Jai Hindustan");
        System.out.println("Jai Hindustan");
        System.out.println("Jai Hindustan");
        System.out.println("Jai Hindustan");
        System.out.println("Jai Hindustan");
        
    }
}
public class CWH_71_Runablethreads {
    public static void main(String[] args) {
        MyThreadeRunnable1 bullet1=new MyThreadeRunnable1();
        Thread gun1= new Thread(bullet1);
        MyThreadeRunnable2 bullet2=new MyThreadeRunnable2();
        Thread gun2= new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
