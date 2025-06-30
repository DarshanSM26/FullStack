import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandlingMethod {
    public static void main(String[] args) throws Exception{
        String a="strive.pdf";
        String content="Banglore";
        Files.write(Paths.get(a),content.getBytes());
        System.out.println("insered successfully");
    }
}
