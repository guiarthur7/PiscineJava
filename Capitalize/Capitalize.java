import java.io.*;
import java.nio.file.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length < 2) return;
        String contenu = Files.readString(Path.of(args[0]));
        contenu = contenu.toUpperCase();
        Files.writeString(Path.of(args[1]), contenu);
    }
}