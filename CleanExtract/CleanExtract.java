public class CleanExtract {
    public static String extract(String s) {
        if (s == null) return "";
        String res = "";
        for (String bloc : s.split("\\|")) {
            int debut = bloc.indexOf('.');
            int fin = bloc.lastIndexOf('.');

            if (debut != -1 && fin > debut) {
                res += bloc.substring(debut + 1, fin).trim() + " ";
            }
        }
        if (res.trim().isEmpty() && !s.contains(".")) {
            return s.replace('|', ' ').replaceAll("\\s+", " ").trim();
        }
        return res.replaceAll("\\s+", " ").trim();
    }
}