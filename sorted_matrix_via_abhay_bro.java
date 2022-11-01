import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void print1D(int arr[]){
        for(int i : arr)System.out.print(i + " ");
    }
    public static void print2D(int arr[][]){
        for(int i[] : arr){
            print1D(i);
            System.out.println();
        }
    }
    public static void input2D(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] =scn.nextInt();
            }
        }
    }
    public static void sort2D(int arr[][]){
        int row = arr.length;
        int column = arr[0].length;
        int mul = row * column;
        int[] new_Arr = new int[mul];
        int k = 0, m = 0;
        for(int i = 0 ;i<arr.length;i++){
            for(int j = 0; j < arr[0].length; j++){
                new_Arr[k] = arr[i][j];
                k++;
            }
        }
        Arrays.sort(new_Arr);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = new_Arr[m];
                m++;
            }
        }
        print2D(arr);
    }
    public static void main(String[] args) {
        int row = scn.nextInt();
        int column = scn.nextInt();
        int arr[][] = new int[row][column];
        input2D(arr);
        sort2D(arr);
    }    
}