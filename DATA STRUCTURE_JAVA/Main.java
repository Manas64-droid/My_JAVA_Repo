import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
    /*
    Reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines.
    The buffer size may be specified, or the default size may be used. The default is large enough for most purposes.
    In general, each read request made of a Reader causes a corresponding read request to be made of the underlying character or byte stream. It is therefore advisable to wrap a BufferedReader around any Reader whose read() operations may be costly, such as FileReaders and InputStreamReaders. For example,

    BufferedReader in
    = new BufferedReader(new FileReader("foo.in"));
    will buffer the input from the specified file. Without buffering, each invocation of read() or readLine() could cause bytes to be read from the file, converted into characters, and then returned, which can be very inefficient.
    Programs that use DataInputStreams for textual input can be localized by replacing each DataInputStream with an appropriate BufferedReader.
    */
        BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
        String list1,list2;
		list1=inp.readLine();
		list2=inp.readLine();

        String[] al=list1.split(","); 
        String[] a2=list2.split(","); 
        for (String a:al){
            int count=0;
            for (String b:a2){
                if(b.equals(a)){
                    count+=1;
                }
            }System.out.println(a+"-"+count);
        
        }// System.out.println("Manas");
    }
}