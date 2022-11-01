import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static String firstLast(String str){
        int n = str.length();
        String sum = "";
        for(int i = 0; i < n; i++){
            if(isVowel(str.charAt(i))){
            //System.out.print(i + ", ");
            sum += i+", ";
            break;
            }
        }
        for(int i = n-1; i >= 0; i--){
            if(isVowel(str.charAt(i))){
            //System.out.print(i);
            sum += i;
            break;
            }
            return sum;
        }
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        System.out.println(firstLast(str));
    }
}