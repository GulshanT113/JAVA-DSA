import java.io.*;
import java.util.*;

public class Solution {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String str = scn.nextLine();
        int c = 0;
        int[] freq = new int[128];
        for(int i = 0; i < str.length(); i++){
            freq[str.charAt(i)]++;
        }
        for(int i = 0; i < str.length()-1; i++){
            if(freq[str.charAt(i)] != freq[str.charAt(i+1)])
                c++;
        }
        if(c != 0)
            System.out.println("False");
        else
            System.out.println("True");
    }
}