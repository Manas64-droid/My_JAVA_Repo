import java.security.Principal;

public class CWH_chp6_arrayMethods {
    public static void main(String[] args) {
        //int marks[]={56,58,77,41,88,99};
        float marks[]={56.1f,58.2f,77,41,88,99};
        System.out.println(marks[5]);
        String names[]={"manas","kaushal","ganya","bochya"};

        System.out.println(marks.length);//! prints lenth of array

        //! display all elements present in names 
        // for (int i=0;i<names.length;i++){
        //     System.out.println(names[i]);
        // }
        // System.out.print("*******\n");

        //! display all elements present in names in reverse manner
        // for (int i=names.length-1;i>=0;i--){
        //     System.out.println(names[i]);
        // }
        // System.out.print("*******\n");

        //! for each loop
        // for(float elements: marks){
        //     System.out.println(elements);
        // }
    }
}
