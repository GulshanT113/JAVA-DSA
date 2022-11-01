import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
    }
    public static void print_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
    }
    
    public static int[] different_way(int[] arr) {
        int n = arr.length, itr = 0, p = -1, c = 0;
        while (itr < n) {
            if (arr[itr] != 0) {
                arr[++p] = arr[itr];
            } else {
                c++;
            }
            itr++;
        }

        while (c-- > 0) {
            arr[++p] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        print_1(different_way(arr));
    }
}
  