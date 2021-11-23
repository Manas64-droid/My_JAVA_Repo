public class CWH_break_continue {
    public static void main(String[] args) {
        // break and continue using for
        // for (int i=0;i<5;i++){
        //     System.out.println(i+" java is great");
        //     //! break statment
        //     if (i==2){
        //         System.out.println("Ending ...");
        //         continue;
        //     }
        // }

        //continue with for
        // for(int i=0;i<=10;i++){
        //     // System.out.println(" End");
        //     if (i==2){
        //         System.out.println(" Cont");
        //         continue;
        //     }
        //     System.out.println(i);
        //     // System.out.println(" continue");
        // }

        //break statment with while
        // int i=0;
        // while (i<5){
        //     System.out.println(i+" Java is great");
        //     i++;
        //     if(i==2) {
        //         System.out.println("Ending ...");
        //         break;
        //     }
        // }

        //! do while with break
        int i=0;
        
        // do{
        //     System.out.println(i);
        //     if(i==9){
        //         break;
        //     }
        //     i--;
        // } while(i>0);
        // System.out.println("loop ends here");

        //! do while wit continue
        do{
            i++;
            if (i==8){
                System.out.println("Hello");
                continue;
            }
            System.out.println(i);
            System.out.print("mm");
        } while (i<10);
            System.out.println("loop ends here");

    }
}
