import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void swap(ArrayList<Integer> arr, int i, int j){
        int v_i = arr.get(i);
        int v_j = arr.get(j);
        arr.set(i, v_j);
        arr.set(j, v_i);
    }
    public static void remove_001(ArrayList<Integer> arr){
        int g = scn.nextInt();
        while(g-- >0){
            int val = scn.nextInt();
            arr.add(val);
        }
        System.out.println(arr);
        int n = arr.size(), i = n-1;
        int data = scn.nextInt();
        while(i >= 0){
            if(arr.get(i) == data){
                swap(arr, i, arr.size()-1);
                arr.remove(arr.size()-1);
            }
            i--;
        }
        System.out.println("after removing data what we removing from array list --->");
        System.out.println(arr);
    }
    public static void remove_data(ArrayList<Integer> arr){
        int g = scn.nextInt();
        while(g-- > 0){
            int val = scn.nextInt();
            arr.add(val);
        }
        int n = arr.size()-1, itr = 0, p = -1, c = 0;
        int data = scn.nextInt();
        while(n >= 0){
            if(arr.get(itr) != data)
            swap(arr, itr++, ++p);
            else{
            c++;
            itr++;
            }
            n--;
        }
        System.out.println("total count of data " + data + " is '" + c + "'");
        while(c-- > 0){
            arr.remove(arr.size()-1);
        }
        System.out.println(arr);
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        remove_data(arr);
    }
}