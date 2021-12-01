import java.io.*;
import java.lang.*;
import java.util.*;
public class ClonableDemo {
    public static class Student implements Cloneable{
        int age;
        String name;
        int arr[]=new int[]{12,23,64,65};
        public Student(int age,String name){
            this.name=name;
            this.age=age;
        }
        public Student(Student other){
            this.name=other.name;
            this.age=other.age;
        }
        @Override
        public Object clone() throws CloneNotSupportedException{
            return super.clone();
            
        }
    }
    public static void main(String[] args) throws CloneNotSupportedException, IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter name->");
        String name=br.readLine();
        System.out.print("Enter age->");
        int age=Integer.parseInt(br.readLine());
        Student manas=new Student(age,name);

        // ! Copying using COPY CONSTRUCTOR
        // System.out.print("Copying using COPY CONSTRUCTOR->");
        // Student twin1=new Student(manas);
        // System.out.println(twin1.age+" "+twin1.name);
        
        // //! By using CLONABLE INTERFACE
        // System.out.print("Copied by using CLONABLE INTERFACE->");
        // Student twin2=(Student)manas.clone();
        // System.out.println(twin2.age+" "+twin2.name);

        // //! shallo copy
        // System.out.println(Arrays.toString(twin2.arr));// array before change
        // twin2.arr[0]=100;
        // System.out.println("Twin2->"+Arrays.toString(twin2.arr)); // array after change
        System.out.println("Manas->"+Arrays.toString(manas.arr)); 

        Student twin3=new Student(2,"rahul");
        //! DEEP COPY
        int arr[]=manas.arr;
        for(int i=0;i<arr.length;i++){
            twin3.arr[i]=arr[i];
        }
        twin3.arr[2]=100;
        System.out.println("Twin3->"+Arrays.toString(twin3.arr));
    }
}
