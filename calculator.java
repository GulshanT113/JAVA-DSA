import java.util.*;
public class calculator{
    public static Scanner scn = new Scanner(System.in);
    
    public static int add(int a, int b){
        return a+b;
    }
    
    public static int sub(int a, int b){
        return a-b;
    }
    
    public static int mul(int a, int b){
        return a*b;
    } 
    
    public static int div(int a, int b){
        return a/b;
    }
    
    public static int mod(int a, int b){
        return a%b;
    }
    
    public static int pwr(int a, int b){
        return a^b;
    }

    public static int calculator(int a, int b, char ch){
        if(ch == '+')
        return add(a, b);
        
        else if(ch == '-')
        return sub(a, b);
        
        else if(ch == '*')
        return mul(a, b);
        
        else if(ch == '/')
        return div(a, b);
        
        else if(ch == '%')
        return mod(a, b);
        
        else if(ch == '^')
        return pwr(a, b);
        
        else{
            System.out.println("invalid input :");
            return -1;
        }
    }

    public static void main(String[] args){
        int a = scn.nextInt();
        int b = scn.nextInt();
        char ch = scn.next().charAt(0);
        int ans = calculator(a, b, ch);
        System.out.println("the respected output = " + ans);
    }
}