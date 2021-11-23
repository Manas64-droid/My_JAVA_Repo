public class CWH_chp7_VariableArguments {
    static int sum(int c,int...arr){

        int result=0;
        // int result=c;//! 1 compulsory argument if no then it produce error
        for (int add:arr){
            result=result+add;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("The Sum:"+sum(2,5,6,67,849,5));
    }
}
