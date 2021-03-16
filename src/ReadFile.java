
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("d:\\Projects\\Templates\\src\\Resources\\input1.txt"), StandardCharsets.UTF_8)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
