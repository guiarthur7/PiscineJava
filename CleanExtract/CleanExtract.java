public class CleanExtract {
    public static String extract(String s) {
        if (s == null ||s.length() == 0) return "";

        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                res += c;
            }
            else if (c == '|') {
                res += ' ';
            }
            else if (c == ' ') {
                res += c;
            }
        }

        return res.toString().replaceAll("\\s+", " ").trim();
    }
}