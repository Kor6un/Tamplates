import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteFile {
    public static void main(String[] args) {

        String data = "Hey!";

        try {
            Files.write(Paths.get("src/Resources/output.txt"), data.getBytes());
            System.out.println("File is writing!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File is NOT writing!!!!\n" + e);
        }
    }
}
