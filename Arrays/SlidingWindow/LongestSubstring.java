

/*
 * Problem: Longest Substring Without Repeating Characters
 * Approach: Sliding Window + Frequency Array (No HashSet)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)  (fixed array size)
 */

import java.util.*;
public class LongestSubstring {

    public static int longestSubstring(String s) {

        int i = 0, j = 0, max = 0;

        int freq[] = new int[256]; // ASCII characters

        while (j < s.length()) {

            char ch = s.charAt(j);
            freq[ch]++;

            // If duplicate found, shrink window
            while (freq[ch] > 1) {
                freq[s.charAt(i)]--;
                i++;
            }

            max = Math.max(max, j - i + 1);
            j++;
        }

        return max;
    }

    public static void main(String[] args) {

        String s = "abcabcbb";

        int result = longestSubstring(s);

        System.out.println("Longest substring length: " + result);
    }
}
