import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class FileUtil {

    // Method to read file content as a String
    public static String readFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    // Method to read file content as bytes
    public static byte[] readFileAsBytes(String filePath) throws IOException {
        return Files.readAllBytes(Paths.get(filePath));
    }

    // Method to write byte data to a file
    public static void writeFile(String filePath, byte[] data) throws IOException {
        Files.write(Paths.get(filePath), data);
    }
}
