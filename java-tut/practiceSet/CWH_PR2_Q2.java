package practiceSet;

public class CWH_PR2_Q2 {
    public static void main(String[] args){
        char a = 'B';
        char grades = (char)(a+8); //! type casting int+char=char

        //program for adding 8 to telling friend your grades indirectly
        System.out.println("Friend:Which grade you get ?");

        System.out.println("Me:I get "+(grades));

        System.out.println("Me:I really get "+(char)(grades-8)+" but ,my dad was passing from near so i encrypted my grade");

        System.out.print("Friend:I also get "+(char)(grades-8)+" same pitch");
    }

}