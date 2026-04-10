public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        String res = "";
        for (int i = s.length() -1; i >= 0; i--) {
            res += s.charAt(i);
        }
        s = s.toLowerCase();
        return s.equals(res.toLowerCase());
    }
}