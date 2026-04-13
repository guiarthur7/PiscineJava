import java.util.*;

public class RegexReplace {

    public static String removeUnits(String input) {
        if (input == null) return null;
        return input.replaceAll("(?<=\\d)\\s*cm", "");
    }

    public static String obfuscateEmail(String email) {
        if (email == null || !email.contains("@")) return email;

        String[] parts = email.split("@");
        String user = parts[0];
        String domain = parts[1];

        if (user.contains(",") || user.contains("-")) {
            user = user.replaceAll("(?<=[,-]).", "*");
        } else if (user.length() > 3) {
            user = user.substring(0, user.length() - 3) + "***";
        }

        String[] d = domain.split("\\.");
        if (d.length == 3) {
            domain = d[0].replaceAll(".", "*") + "." + d[1] + "." + d[2].replaceAll(".", "*");
        } else if (d.length == 2) {
            String tld = d[1].matches("com|org|net") ? d[1] : d[1].replaceAll(".", "*");
            domain = d[0].replaceAll(".", "*") + "." + tld;
        }

        return user + "@" + domain;
    }
}