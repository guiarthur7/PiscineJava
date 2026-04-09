public class StringReplace {
    public static String replace(String s, CharSequence target, CharSequence replacement) {
        if (s == null) {
            return null;
        }
        return s.replace(target, replacement);
    }
}