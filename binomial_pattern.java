import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void pattern_binomial(){
        int n = scn.nextInt();
        for(int i = 0; i < n; i++){
            int i_1 = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(i_1 + " ");
                int i_2 = i_1*(i-j)/(j+1);
                i_1 = i_2;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern_binomial();
    }
} 