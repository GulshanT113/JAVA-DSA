import java.util.*;
public class Solution {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int x1 = scn.nextInt();
        int y1 = scn.nextInt();
        int x2 = scn.nextInt();
        int y2 = scn.nextInt();
        double d = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println((int)Math.round(d*1.0));
    }
}
