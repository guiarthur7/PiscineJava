import java.util.*;

public class RegexReplace {

    public static String removeUnits(String input) {
        if (input == null) return null;
        return input.replaceAll("(?<=\\d)(cm|€)(?!²)", "");
    }

    public static String obfuscateEmail(String email) {
        if (email == null || !email.contains("@")) return email;

        String[] parts = email.split("@");
        String user = parts[0];
        String domain = parts[1];

        if (user.length() > 3) {
            user = user.substring(0, 3) + user.substring(3).replaceAll(".", "*");
        } else {
            user = user.replaceAll(".", "*");
        }

        String[] d = domain.split("\\.");
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < d.length; i++) {
            if (d[i].length() == 2) {
                res.append(d[i]);
            } else {
                res.append(d[i].replaceAll(".", "*"));
            }
            if (i < d.length - 1) {
                res.append(".");
            }
        }

        return user + "@" + res.toString();
    }
}