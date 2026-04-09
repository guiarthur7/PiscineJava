public class CleanExtract {
    public static String extract(String s) {
        if (s == null) return "";
        String res = "";

        for (String bloc : s.split("\\|")) {
            int debut = bloc.indexOf('.');
            int fin = bloc.lastIndexOf('.');

            if (debut != -1 && fin != -1 && debut < fin) {
                res += bloc.substring(debut + 1, fin).trim() + " ";
            }
            else {
                res += bloc.replace(".", "").trim() + " ";
            }
        }

        return res.replaceAll("\\s+", " ").trim();
    }
}