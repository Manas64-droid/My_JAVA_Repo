

public class CWH_chp7_1_Methods_overloading {
    //! void use when we dont want to return any data type
    static void tellJock(){
        System.out.println("hello there meme");

    }
    static void changeArray(int[]lst){
        lst[0]=64;
        
    }
    static void foo(){
        System.out.println("Hello bro");
    }
    static void foo(int a){
        System.out.println("Hello "+a+" bro");
    }
    static void foo(int[] b){
        b[3]=64;
    }
    public static void main(String[] args) {
        // tellJock();

        //! case1:{
            /*
            if user wants to change class valuses 
            with help of function/method he can't change 
            he make only copy of it
            */
        //!}

        //! case2:{
            /*
            !if user wants to change value of list/array
            */
        //!}
        int []marks={45,164,46,99};
        changeArray(marks);
        for (int e: marks){
            System.out.print(e+",");
        }
        System.out.println("\n");

        //!method overloading
        foo();

        foo(56);

        int[] rad={566,789,555,33,558,4,56};
        foo(rad);
        for (int e: rad){
            System.out.print(e+",");
        }
        System.out.println("\n");

        
    }
}
