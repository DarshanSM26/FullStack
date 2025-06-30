import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandlingAssigment3 {
    public static void main(String[] args) {
        String a="FileMethod";
        String content="Welcome to file handling in File Method";
        try{
            Files.write(Paths.get(a),"".getBytes());
            System.out.println("File created successfully");
            Files.write(Paths.get(a),content.getBytes());
            System.out.println("Data inserted");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
