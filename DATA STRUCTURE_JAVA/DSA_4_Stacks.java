import java.util.*;
public class DSA_4_Stacks {
    public static void main(String[] args){
        Stack<Integer> stk=new Stack<>();
        stk.push(34);
        stk.push(19);
        stk.push(64);
        stk.push(43);

        int popped=stk.pop();
        System.out.println(popped);
        int peeked=stk.peek();
        System.out.println(peeked);


    }
}
