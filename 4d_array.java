import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[][][][] arr, int a, int b, int c, int d){
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                for(int k = 0; k < c; k++){
                    for(int l = 0; l < d; l++){
                        arr[i][j][k][l] = scn.nextInt();
                    }
                }
            }
        }
        System.out.println();
    }
    public static void print_1(int[][][][] arr, int a, int b, int c, int d){
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                for(int k = 0; k < c; k++){
                    for(int l = 0; l < d; l++){
                        System.out.print(arr[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();
        int[][][][] arr = new int[a][b][c][d];
        input_1(arr, a, b, c, d);
        print_1(arr, a, b, c, d);
    }
}