import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(') st.push(c);
            else{
                if(st.isEmpty()) return false;
                else if(c == ')' && st.peek() != '(') return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args){
        System.out.println(isValid(scn.nextLine()));
    }
}