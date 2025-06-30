import java.io.FileOutputStream;

public class FileHandlingfileoutstream {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("one.jpg")){
               System.out.println("binary file created successfully");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
