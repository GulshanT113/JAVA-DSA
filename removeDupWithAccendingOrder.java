import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static String countOccurence(String str){
        int[] freq = new int[128];
        for(int i = 0; i < str.length(); i++)
            freq[str.charAt(i)]++;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 128; i++){
            if(freq[i] > 0)
            sb.append((char)i);
            if(freq[i] > 1)
            sb.append(freq[i]);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        System.out.println(countOccurence(scn.nextLine()));
    }
}