public class CleanExtract {
    public static String extract(String s) {
        if (s == null) {
            return null;
        }

        String[] parts = s.split("\\|");
        String result = "";

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i].trim();
            String extracted = "";

            int firstDot = part.indexOf('.');
            int lastDot = part.lastIndexOf('.');

            if (firstDot == -1) {
                extracted = part;
            } else if (firstDot == lastDot) {
                extracted = part.substring(firstDot + 1).trim();
            } else {
                extracted = part.substring(firstDot + 1, lastDot).trim();
            }

            if (!extracted.isEmpty()) {
                if (!result.isEmpty()) {
                    result += " ";
                }
                result += extracted;
            }
        }

        return result;
    }
}