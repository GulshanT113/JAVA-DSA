import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static String LowerCase(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
            sb.append((char)(str.charAt(i)-'A'+'a'));
            else
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static String countOccurence(String str){
        str = str.replaceAll("( )+", " ");
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            String s = arr[i];
            if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z'){
                sb.append((char) (s.charAt(0)-'a'+'A'));
                sb.append(LowerCase(s.substring(1)));
            }
            else
            sb.append(s.charAt(0)+LowerCase(s.substring(1)));
            if(i != s.length()){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        System.out.println(countOccurence(scn.nextLine()));
    }
}