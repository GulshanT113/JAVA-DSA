import java.util.*;
public class Main{
    static void removeDuplicate(char str[], int n){
        HashSet<Character> s = new LinkedHashSet<>(n - 1);
        for (char x : str)
            s.add(x);
        for (char x : s)
            System.out.print(x);
    }
    public static void main(String[] args){
        char str[] = "geeksforgeeks".toCharArray();
        int n = str.length;
        removeDuplicate(str, n);
    }
}