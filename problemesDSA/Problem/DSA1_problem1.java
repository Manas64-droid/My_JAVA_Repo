package Problem;

public class DSA1_problem1 {
    static void mobileKeyCombo(String unprocess,String process){
        if(unprocess.isEmpty()){
            System.out.println(process);
            return;
        }
        int digit=unprocess.charAt(0)-'0';//! it will return "2"->2;
        for(int i=(digit-1)*3;i<(digit)*3;i++){
            char ch=(char)('a'+i);
            mobileKeyCombo(unprocess.substring(1),process+ch);
        }
    }

    public static void main(String[] args)
    {
        // String str="24";
        // int digit=str.charAt(0)-'0';//! it will return "2"->2;
        // System.out.println(digit);
        mobileKeyCombo("12", "");
    }
}