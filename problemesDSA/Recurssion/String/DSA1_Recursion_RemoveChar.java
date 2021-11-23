package Recurssion.String;

public class DSA1_Recursion_RemoveChar {
    static void removeChar(String Modstr,String UnModstr){
        if(UnModstr.isEmpty()){
            System.out.println(Modstr);
            return;
        }
        char ch=UnModstr.charAt(0);
        if(ch=='a'){
            removeChar(Modstr,UnModstr.substring(1));
        }
        else{
            // Modstr.substring(1);
            removeChar(Modstr+ch, UnModstr.substring(1));
        }

    }
    static String skipCharInString(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch=str.charAt(0);
        if(ch=='a'){
            return skipCharInString(str.substring(1));
        }
        else{
            return ch+skipCharInString(str.substring(1));
        }
    }

    static String skipEntireWord(String str){
        if(str.isEmpty()){
            return "";
        }
        boolean startsWith = str.startsWith("man");
        if(startsWith){
            return skipCharInString(str.substring(3));
        }
        else{
            return str.charAt(0)+skipCharInString(str.substring(1));
        }
    }

    static String skipEntireWord1(String str){
        if(str.isEmpty()){
            return "";
        }
        boolean startsWith = str.startsWith("man");
        if(startsWith && str.startsWith("manas")){
            return skipCharInString1(str.substring(3));
        }
        else{
            return str.charAt(0)+skipCharInString1(str.substring(1));
        }
    }
    private static String skipCharInString1(String substring) {
        return null;
    }
    public static void main(String[] args) {
        /*
        String unModstr = "asdfghkala";
        removeChar("",unModstr);
        */

        //! removing perticular charcter from String
        // System.out.println(skipCharInString("My Name Is Manas"));

        //! if Sting contains curtain word skip entire word from String
        System.out.println(skipEntireWord("asdmanasjkl"));
        System.out.println(skipEntireWord1("asdmanasjkl"));
    }
}
