import java.io.*;

public class Cat {
    public static void cat(String[] args) throws IOException {
        for (String file : args) {
            FileInputStream in = new FileInputStream(file);

            byte[] buffer = new byte[1024];
            int n;

            while ((n = in.read(buffer)) != -1) {
                System.out.write(buffer, 0, n);
            }

            in.close();
        }
    }
}