import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int[][] input_2D(){
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length, r = 0, c = m - 1;
        while (r < n && c >= 0) {
            if (matrix[r][c] == target)
                return true;
            else if (matrix[r][c] > target)
                c--;
            else
                r++;
        }
        return false;
    }
    public static void main(String[] args){
        int[][] arr = input_2D();
        System.out.println(searchMatrix(arr, scn.nextInt()));
    }
}