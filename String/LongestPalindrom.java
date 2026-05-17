public class LongestPalindrome {

    // longestPalindrome from a String
    public static String palindrome(String str) {

        if (str == null || str.length() < 1) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < str.length(); i++) {

            int length1 = expand(str, i, i);
            int length2 = expand(str, i, i + 1);

            int length = Math.max(length1, length2);

            if (length > end - start) {

                start = i - (length - 1) / 2;
                end = i + length / 2;
            }
        }

        return str.substring(start, end + 1);
    }

    public static int expand(String str, int left, int right) {

        while (left >= 0 &&
               right < str.length() &&
               str.charAt(left) == str.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String[] args) {

        String str = "babad";
        System.out.println(palindrome(str));
    }
}
