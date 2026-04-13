public class RegexMatch {
    public static boolean containsOnlyAlpha(String s) {
        if (s.matches("[a-zA-Z]+")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean startWithLetterAndEndWithNumber(String s) {
        if (s.matches("^[a-zA-Z].*\\d$")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean containsAtLeast3SuccessiveA(String s) {
        if (s.matches(".*AAA.*")) {
            return true;
        } else {
            return false;
        }
    }
}