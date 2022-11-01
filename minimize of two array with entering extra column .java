import java.util.*;

public class Main {

    public static Scanner scn = new Scanner(System.in);

    public static void input1D(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt(); // write
        }
    }

    public static void print1D(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // read
        }
        System.out.println();
    }
    public static String sumOftwoArrays(int[] A, int[] B) {
        int n = A.length, m = B.length;
        int len = Math.max(n, m) + 1;

        int[] ans = new int[len];
        int i = n - 1, j = m - 1, k = len - 1;

        while (i >= 0 || j >= 0) {
            int sum = (i >= 0 ? A[i] : 0) - (j >= 0 ? B[j] : 0);
            int digit = sum % 10;
            //5carry = sum / 10;

            ans[k--] = digit;
            i--;
            j--;
        }
        String res = "";
        for(int p = 0; p < len; p++){
            if(p == 0 && ans[p] == 0)
            continue;
            
            res += ans[p];
        }
        return res;
    }
    
    public static void sumOftwoArraysProgram() {
        int n = scn.nextInt();
        int[] A = new int[n];
        input1D(A);

        int m = scn.nextInt();
        int[] B = new int[m];
        input1D(B);
        //print1D(sumOftwoArrays(A, B));
        System.out.println(sumOftwoArrays(A, B));
    }

    public static void main(String[] args) {
        sumOftwoArraysProgram();

    }

}