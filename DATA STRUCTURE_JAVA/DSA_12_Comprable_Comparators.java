import java.util.*;
class Student implements Comparable<Student>{
    int marks;
    String Name;
    public Student(int marks,String Name){
        super();
        this.marks=marks;
        this.Name=Name;
    }
    @Override
    public String toString(){
        return "Student [marks="+marks+",name="+Name+"]";
    }
    public int getMarks(){
        return this.marks;
    }
    public String getName(){
        return this.Name;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    @Override
    public int compareTo(Student obj) {//! sorting with name
        //! -1 & 1 -> increasing order
        //! 1 & -1 -> decreasing order
        if(this.marks>obj.marks) return 1;
        else if(this.marks<obj.marks) return -1;
        return this.Name.compareTo(obj.Name);//! arjum & karan having same marks but arjun comes first
    }
}
//! sorting with name as well as marks
class SortByTheMarks implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2){
        if(o1.Name.equals(o2.Name)){
            return o1.marks-o2.marks;
        }
        else{
            return o1.Name.compareTo(o2.Name);
        }
    }
}
public class DSA_12_Comprable_Comparators {
    // String Student = null;

    public static void main(String[] args) {
        List<Student> std=new ArrayList<>();

        std.add(new Student(23,"Ram"));
        std.add(new Student(45, "Suraj"));
        std.add(new Student(21,"Ram"));
        std.add(new Student(20,"Karan"));
        std.add(new Student(20,"Arjun"));
        std.add(new Student(30,"Danny"));

        std.forEach(System.out::println); //! print all elements present in list
        System.out.println();

        Collections.sort(std);
        std.forEach(System.out::println); //! print all elements present in list
        System.out.println();
        
        //! list compare with parameter Name & Marks
        Collections.sort(std, Comparator.comparing(Student::getName).thenComparing(Student::getMarks));
        std.forEach(System.out::println); //! print all elements present in list
        System.out.println();
        
        //! list compare with parameter Name & Marks print reverse
        Collections.sort(std, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
        std.forEach(System.out::println); //! print all elements present in list

    }

}
