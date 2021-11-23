package CWH_OOPS;

import CWH_OOPS.MyPhone.SmartPhone_My;

// import CWH_OOPS.myPhone.SmartPhone_My;

interface MyCamera{
    void takeSnap();
    void recordVideo();
    default void hdRecording(){
        //! default keyword does not ristrict user 
        //! to define this hdRecodrdings function
        System.out.println("Capturing HD video");
    }
}

interface MyWifi{
    String[] Networks();
    void connectToNetwok(String network);
}

class MyPhone{
    void callNumber(int phoneNum){
        System.out.println("Calling..."+phoneNum);
    }
    void pickCall(){
        System.out.println();
    }
class SmartPhone_My extends MyPhone implements MyWifi,MyCamera{
    public void  takeSnap(){
        System.out.println("Smartphone Ready To Take Snap...");
    }
    public void recordVideo(){
        System.out.println("Smartphone Ready To Capture Video...");
    }
    public String[] Networks(){
        String[] networkLst={"MyJoi","ComputerRaja","Computer JioJi"};
        return networkLst;
    }
    public void connectToNetwok(String network){
        System.out.println("Connecting to networks");
    }
}

}
public class CWH_57_Chp10_DefaultMethods {
    public static void main(String[] args) {
        String[]lst;
        // MyCamera cam1=new SmartPhone_My();

    


        // lst=vivo.getNetworks();

        // for(int i=0;i<lst.length;i++){
        //     System.out.print(lst[i]+" ");
        // }
        // System.out.print("\n");
    }
}
