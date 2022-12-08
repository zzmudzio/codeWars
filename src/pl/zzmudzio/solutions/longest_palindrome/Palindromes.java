package pl.zzmudzio.solutions.longest_palindrome;

public class Palindromes {
    public static int longestPalindrome(final String s) { // e.g. this is a super racecar
        if (s.length() < 2) return s.length();
        int maxPalindromeLength = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (isPalindrome(s.substring(i, j + 1))) {
                    int length = s.substring(i, j + 1).length();
                    if (length > maxPalindromeLength) {
                        maxPalindromeLength = length;
                    }
                }
            }
        }
        return maxPalindromeLength;
}

    public static boolean isPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }
}
