import java.io.*;
import java.nio.file.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length < 2) return;
        String contenu = Files.readString(Path.of(args[0]));
        String[] mots = contenu.trim().replaceAll("\\s+", " ").split(" ");

        for (int i = 0; i < mots.length; i++) {
            if (mots[i].length() > 0) {
                mots[i] = mots[i].substring(0, 1).toUpperCase() + mots[i].substring(1).toLowerCase();
            }
        }
        String resultatFinal = String.join(" ", mots);
        Files.writeString(Path.of(args[1]), resultatFinal);
    }
}