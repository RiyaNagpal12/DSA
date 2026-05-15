// Find the longest substring without repeating characters 
import java.util.HashSet;

public class LongestSubstring {

    public static void longestSubstring(String str) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;

        for (int right = 0; right < str.length(); right++) {

            while (set.contains(str.charAt(right))) {

                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));
        }

        System.out.println(set);
    }

    public static void main(String[] args) {

        longestSubstring("abcabcbb");
    }
}
