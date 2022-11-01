import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int n = scn.nextInt();
        char ch_1 = 'a';
        char ch_2 = 'A';
        char ch_3 = '#';
        
        for(int i = 1; i <= n; i++){
            System.out.println(ch_1 + " " + i + " " + ch_2 + " " + ch_3);
            ch_1++;
            ch_2++;
            ch_3++;
        }
    }
}