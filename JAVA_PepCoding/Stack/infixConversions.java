package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class infixConversions {
    public static int priority(char ch){
        if(ch=='+'|| ch=='-'){
            return 1;
        }
        else if(ch=='*' || ch=='/'){
            return 2;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) throws IOException {
        /*
        ! a+b INFIX
        ! +ab PREFIX
        ! ab+ POSTFIX
        */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Stack<String> prefix=new Stack<>();
        Stack<String> postfix=new Stack<>();
        Stack<Character> operetors=new Stack<>();

        String str=br.readLine();
        // char=
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                operetors.push(ch);
            }
            else if((ch>='0' && ch<='9') || (ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                prefix.push(ch+"");
                postfix.push(ch+"");
            }
            else if(ch==')'){
                while(operetors.peek()!='('){
                    char operate=operetors.pop();
                    String num2=postfix.pop();
                    String num1=postfix.pop();
                    String resultPostfix=num1+num2+operate;
                    postfix.push(resultPostfix);

                    String num4=prefix.pop();
                    String num3=prefix.pop();
                    String resultPrefix=operate+num3+num4;
                    postfix.push(resultPrefix);
                }
                operetors.pop();
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                while(operetors.size()>0 && operetors.peek()!='(' && priority(ch)<=priority(operetors.peek())){
                    char operate=operetors.pop();
                    String num2=postfix.pop();
                    String num1=postfix.pop();
                    String resultPostfix=num1+num2+operate;
                    postfix.push(resultPostfix);

                    String num4=prefix.pop();
                    String num3=prefix.pop();
                    String resultPrefix=operate+num3+num4;
                    prefix.push(resultPrefix);
                }
                operetors.push(ch);

            }
        }
        while(operetors.size()!=0){
            char operate=operetors.pop();
            String num2=postfix.pop();
            String num1=postfix.pop();
            String resultPostfix=num1+num2+operate;

            postfix.push(resultPostfix);            
            String num4=prefix.pop();
            String num3=prefix.pop();
            String resultPrefix=operate+num3+num4;
            postfix.push(resultPrefix);
        }            
        // System.out.println(prefix);
        System.out.println(postfix);
    }
}
