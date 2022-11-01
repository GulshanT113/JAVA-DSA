import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static boolean isAnagram(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int c = 0;
        if(n != m) 
        return false;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(str1.charAt(i) == str2.charAt(j))
                c++;
            }
        }
        if(c < n)
        return false;
        return true;
    }
    public static void main(String[] args){
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        System.out.println(isAnagram(str1, str2));
    }
}