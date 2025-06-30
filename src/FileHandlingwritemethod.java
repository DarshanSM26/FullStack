import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandlingwritemethod {
    public static void main(String[] args) {
        String a="jav.jpg";
        try{
            Files.write(Paths.get(a),"Hello raj?".getBytes());
            System.out.println("File created successfully");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
