public class CWH_chp3_stringMethods {
    public static void main(String[] args) {
        String name="Manas";

        //string length methods
        int value =name.length();
        System.out.println(value); //! it returns length of string
        
        //string tolowercase() methods
        String lstr =name.toLowerCase();
        System.out.println(lstr); //! it returns string into lowercase format

        //string toupercase() method
        String ustr =name.toUpperCase();
        System.out.println(ustr); //! it returns string into upercase format

        String nonTrimString="            Mans is a good boy           ";
        //string trim method
        String nts=nonTrimString.trim(); //! it returns string ecluding etra spaces
        System.out.println(nts);

        //String substring method
        System.out.println(name.substring(2)); //! it return substring of main string from starting index which is given by user
        System.out.println(name.substring(2,4)); //! it returns substring from starting idex to -1 ending index
        /*
        (a)
        name= Manas //! main string
        name= 01234 //! index numbers

        (a,b)
        a is start idex of string(included)
        b is start idex of string(Excluded)
        */

        //String replace method 
        System.out.println(name.replace('M','N')); //! replace letters from main string with given letter
        System.out.println(name.replace("as", "ny")); //! replace characters from main string given letters

        //String stratwith & endswith method
        System.out.println(name.startsWith("Ma"));//! does it startwith given prifix
        System.out.println(name.endsWith("as"));//! does it endwith given prifix
        /*
        if {main string starting & end with given prifix then it will return true}
        else:
        return false
        
        */

        //String charAt() method
        System.out.println(name.charAt(2));//! print inde prifix
        /*
        name= Manas //! main string
        name= 01234 //! index numbers
        */

        //String indexOf() method
        System.out.println(name.indexOf("as"));//!print indx for given prifix
        /**
        if given prifix is not available in main string it will return -1
        else print indx for given prifix 
        direction of serch =>
        */

        //String last index method 
        System.out.println(name.lastIndexOf("M"));//! print last ouurace index of given prifix
        /*
        name= Manas //! main string
        name= 01234 //! index numbers
        directiom <= of serch

        */

        //String equals method
        System.out.println(name.equals("manny"));//! cheak enter string is equal to main string or not

        //String equals ignore method
        System.out.println(name.equalsIgnoreCase("manas"));
        /*
        only true when name=Name with same combination
        else false
        */

        System.out.println("i am escape sequence \\ back slash");
        System.out.println("i am escape sequence \" double quote");
        System.out.println("i am escape sequence \' single quote");
        System.out.println("i am escape sequence \n new line");
        System.out.println("i am escape sequence \t tab");
        /*
        \b
        \f
        \r
        */
    }
}
