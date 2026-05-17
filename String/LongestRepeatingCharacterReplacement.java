//LongestRepeatinfCharacter 
public class LongestRepeatingCharacterReplacement {

    public static int maxlength(String str, int k) {

        int[] freq = new int[26];

        int left = 0;
        int maxlength = 0;
        int maxfreq = 0;

        for(int right = 0; right < str.length(); right++) {

            char ch = str.charAt(right);

            freq[ch - 'A']++;

            maxfreq = Math.max(maxfreq, freq[ch - 'A']);

            while((right - left + 1) - maxfreq > k) {

                freq[str.charAt(left) - 'A']--;

                left++;
            }

            maxlength = Math.max(maxlength, right - left + 1);
        }

        return maxlength;
    }

    public static void main(String[] args) {

        String str = "AABABBA";
        int k = 1;

        System.out.println(maxlength(str, k));
    }
}
