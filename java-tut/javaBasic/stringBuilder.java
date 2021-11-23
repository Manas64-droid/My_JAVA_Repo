package javaBasic;
public class stringBuilder
{
    public static void main(String[] args)
    {
        StringBuilder sb= new StringBuilder("Manas");
        System.out.println(sb);

        System.out.print("charAt method-> <");
        for(int i=0;i<sb.length();i++)
        {
            System.out.print(sb.charAt(i));
        }
        System.out.println(">");

        //! setCharAt method
        sb.setCharAt(3,'u');
        System.out.println("setCharAt method->"+sb);

        //! insert method
        sb.insert(3,'u');
        System.out.println("insert method->"+sb);
        
        //! delet method
        sb.delete(3,6);
        System.out.println("delete method->"+sb);

        //! append method 
        sb.append("as");
        System.out.println("append method->"+sb);
    }
}
