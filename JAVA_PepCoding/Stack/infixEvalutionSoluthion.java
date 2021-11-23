package Stack;

import java.io.*;
import java.util.Stack;
public class infixEvalutionSoluthion{
    public static int precidence(char operator){
        if(operator=='+'|| operator=='-'){
            return 1;
        }
        else if(operator=='*' || operator=='/'){
            return 2;
        }
        else{
            return 0;
        }
    }
    public static int actualOperation(int num1,int num2,char operator){
        if(operator=='+'){
            return num1+num2;
        }else if(operator=='-'){
            return num1-num2;
        }
        else if(operator=='*'){
            return num1*num2;
        }
        else{ 
            return num1/num2;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> operands=new Stack<>();
        Stack<Character> operator=new Stack<>();

        String str="4*10-(6/2)";
        String str2=br.readLine();
        // System.out.println(str2.getClass());
        // for(int i=0;i<str.length();i++){
        //     char ch=str.charAt(i);
        //     // System.out.println(ch);
        //     if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'){
        //         operands.push(ch-'0');
        //     }
        //     else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='('||ch==')'){
        //         operator.push(ch);
        //     }
        // }
        // System.out.println(operands);
        // System.out.println(operator);
        
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            if(ch=='('){
                operator.push(ch);
            }
            else if(Character.isDigit(ch)){
                operands.push(ch-'0');
            }
            else if(ch==')'){
                while(operator.peek()!='('){
                    char operators=operator.pop();
                    int num2=operands.pop();
                    int num1=operands.pop();
                    // int  Operation=actualOperation(num1, num2, operators);
                    operands.push(actualOperation(num1, num2, operators));
                }
                operator.pop();
            }
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                while(operator.size()>0 && operator.peek()!='(' && precidence(ch)<=precidence(operator.peek())){
                    char operators=operator.pop();
                    int num2=operands.pop();
                    int num1=operands.pop();
                    // int  Operation=actualOperation(num1, num2, operators);
                    operands.push(actualOperation(num1, num2, operators));
                }
                operator.push(ch);
            }
        }
        while(operator.size()!=0){
            char operators=operator.pop();
            int num2=operands.pop();
            int num1=operands.pop();
            // int  Operation=actualOperation(num1, num2, operators);
            operands.push(actualOperation(num1, num2, operators));
        }
        System.out.println(operands.peek());
        
    }
}