import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static double Square_Root(double digit){
        double tamp;
        double sqr_root = digit/2;
        do{
            tamp = sqr_root;
            sqr_root = (tamp + (digit/tamp)) / 2;
        }
        while((tamp-sqr_root) != 0);
        return sqr_root;
    }
    public static void main(String[] args){
        System.out.println(Square_Root(scn.nextDouble()));
    }
}