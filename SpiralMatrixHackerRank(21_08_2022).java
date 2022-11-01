import java.util.*;
public class Solution {
    public static Scanner scn = new Scanner(System.in);
    public static int[][] input2D(){
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++)
                    arr[i][j] = scn.nextInt();
            }
        return arr;
    }
    public static void spiral(int[][] arr){
        int n = arr.length, m = arr[0].length;
        if(n == 0) return;
        int left = 0, right = m-1, top = 0, bottom = n-1, d = 0;
        while(left <= right && top <= bottom){
            if(d == 0){
                for(int i = left; i <= right; i++)
                    System.out.print(arr[top][i] + " ");
                d++; top++;
            }
            else if(d == 1){
                for(int i = top; i <= bottom; i++)
                    System.out.print(arr[i][right] + " ");
                d++; right--;
            }
            else if(d == 2){
                for(int i = right; i >= left; i--)
                    System.out.print(arr[bottom][i] + " ");
                d++; bottom--;
            }
            else if(d == 3){
                for(int i = bottom; i >= top; i--)
                    System.out.print(arr[i][left] + " ");
                d = 0;
                left++;
            }   
        }
    }
    public static void main(String[] args) {
        int[][] arr = input2D();
        spiral(arr);
    }
}
