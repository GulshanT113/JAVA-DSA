import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void swap(ArrayList<Integer> arr, int i, int j){
        int v_i = arr.get(i);
        int v_j = arr.get(j);
        arr.set(i, v_j);
        arr.set(j, v_i);
    }
    public static void bouble_sort(ArrayList<Integer> arr){
        int n = arr.size();
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n-i; j++){
                if(arr.get(j-1) > arr.get(j))
                swap(arr, j-1, j);
            }
        }
    }
    public static void reverse_all(ArrayList<Integer> arr){
        int n = arr.size(), i = 0, j = n-1;
        while(i < j){
            swap(arr, i++, j--);
        }
    }
    public static void remove_all(ArrayList<Integer> arr){
        int n = arr.size(), i = n-1;
        while(i >= 0){
            arr.get(i);
            arr.remove(i);
            i--;
        }
    }
    public static void basic_array_list(ArrayList<Integer> arr){
        int n = scn.nextInt();
        while(n-- > 0){
            int value = scn.nextInt();
            arr.add(value);
        }
        System.out.println("before sorting --->");
        System.out.println(arr);
        System.out.println();
        bouble_sort(arr);
        System.out.println("after sorting --->");
        System.out.println(arr);
        System.out.println();
        reverse_all(arr);
        System.out.println("after reverse function --->");
        System.out.println(arr);
        remove_all(arr);
        System.out.println("after removing start --->");
        System.out.println(arr);
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        basic_array_list(arr);
    }
}