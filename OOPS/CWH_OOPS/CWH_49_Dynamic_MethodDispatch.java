package CWH_OOPS;

class Phone{
    public void showTime(){
        System.out.println("Time 6:46am");
    }
    public void on(){
        System.out.println("i am phone...");
    }
}

class SmartPhone extends Phone{
    public void playMusic(){//! we can't call this method coz it's not in super class
        System.out.println("Playing music ...");
    }
    @Override
    public void on(){
        System.out.println("i am smartphone");
    }
    public String[] getNetworks() {
        return null;
    }
}
public class CWH_49_Dynamic_MethodDispatch {
    public static void main(String[] args) {
        // Phone one1=new Phone();
        // SmartPhone two=new SmartPhone();
        // one1.name();

        Phone feature=new SmartPhone();
        feature.showTime();
        feature.on();
        // feature.playMusic();//! produce error coz we can't call method of sub class
    }
}
