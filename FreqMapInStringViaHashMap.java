import java.util.*;
public class FreqMapInStringViaHashMap {
    public static void main(String[] args) {
        //Scanner scn = new Scanner(System.in);
        String str = "abdkfjdskfsd";
        HashMap<Character, Integer> hm = new HashMap<>();

        for(char c : str.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for(char c = 'a'; c <= 'z'; c ++) {
            if(hm.get(c) != null) System.out.println(c + " : " + hm.get(c));
        }
    }
}
