import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void print_1(String str_1, String str_2){
        char[] a = str_1.toCharArray();
        char[] b = str_2.toCharArray();
        int n = a.length;
        int m = b.length;
        Arrays.sort(a);
        Arrays.sort(b);
        int c = 0;
        if(n == m){
            for(int i = 0; i < n; i++){
                if(a[i] == b[i])
                    c++;
            }
            if(c == n)
            System.out.println("Both String Characters Are Same.");
            else
            System.out.println("Both String Characters Are Not Same.");
        }
        else{
            System.out.println("Error : If You Want Valid Answer, Please Enter Both String Length Same.");
        }
    }
    public static void main(String[] args) {
        String str_1 = scn.nextLine();
        String str_2 = scn.nextLine();
        print_1(str_1, str_2);
    }
}