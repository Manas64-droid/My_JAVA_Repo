import java.util.*;
public class Compareable {
    public static class Student implements Comparable<Student>{
        int rollNumber;
        float marks;
        public Student (int r,float m){
            this.rollNumber=r;
            this.marks=m;
        }
        @Override
        public String toString(){
            return rollNumber+"->"+marks;

        }
        @Override
        public int compareTo(Student o) {
            if(this.rollNumber>o.rollNumber) return -1;
            else if(this.rollNumber<o.rollNumber) return 1;
            else return 0;
        }
        
    }
    public static void main(String[] args) {
        Student manas=new Student(64, 74.91f);
        Student nihar=new Student(4, 87.91f);
        Student ganesh=new Student(83, 54.91f);
        Student prajwal=new Student(5, 79.91f);
        
        Student[] list={manas,nihar,ganesh,prajwal};
        extracted(list);
        System.out.println(Arrays.toString(list));
    }
    private static void extracted(Student[] list) {
        Arrays.sort(list);
    }
}
