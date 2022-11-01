import java.util.*;
public class Solution {
    public static Scanner scn = new Scanner(System.in);
    public static void find(String s, String p){
        int n = s.length();
        int m = p.length();
        ArrayList<Integer> ans = new ArrayList<>();
        //if(m > n) return ans;
        int[] s1 = new int[26];
        int[] p1 = new int[26];
        for(int i = 0; i < m; i++){
            p1[p.charAt(i)-'a']++;
            s1[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(p1, s1)) ans.add(0);
        for(int i = m; i < n; i++){
            s1[s.charAt(i-m)-'a']--;
            s1[s.charAt(i)-'a']++;
            if(Arrays.equals(p1, s1)) ans.add(i-m+1);
        }
        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        find(scn.nextLine(), scn.nextLine());
    }  
}
