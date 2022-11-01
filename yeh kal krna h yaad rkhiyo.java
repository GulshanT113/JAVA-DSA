import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int[][] input2D(){
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++)
            arr[i][j] = scn.nextInt();
        }
        return arr;
    }
    public static void kWeakestRows(int[][] mat, int k) {
        int c = 0;
        int[] a = new int[mat.length]; 
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[j] == 1)
                    c++;
            }
            a[i] = c;
            c = 0;
        }
        for(int i = 0; i < a.length; i++)
        System.out.print(a[i] + " ");
    }
    public static void main(String[] args) {
        int[][] arr = input2D();
        kWeakestRows(arr, scn.nextInt());
    }
}
