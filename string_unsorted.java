import java.util.*;
public class Main
{
    public static Scanner scn = new Scanner(System.in);
    public static void pattern_string(String str){
        if(str.length() == 0)
        return str;
        else if(str.length() == 1 && str.charAt(0) == 'x')
        return "";
        
        int last = str.length() -1;
        int begin = str.charAt(0) == 'x' ? 1: 0;
        int end = str.charAt(last) == 'x' ? last -1: last;
        return str.substring(begin, end+1);
    }
    
    
    
    public static void main(String[] args) {
        String str = scn.nextLine();
        pattern_string(str);
    }
}
