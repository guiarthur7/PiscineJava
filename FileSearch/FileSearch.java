import java.io.File;

public class FileSearch {
    public static String searchFile(String fileName) {
        return search(new File("documents"), fileName);
    }

    private static String search(File folder, String fileName) {
        File[] files = folder.listFiles();
        if (files == null) return null;

        for (File f : files) {
            if (f.isDirectory()) {
                String res = search(f, fileName);
                if (res != null) return res;
            } else if (f.getName().equals(fileName)) {
                return f.getPath().replace("\\", "/");
            }
        }
        return null;
    }
}