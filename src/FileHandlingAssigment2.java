import java.io.FileOutputStream;

public class FileHandlingAssigment2 {
    public static void main(String[] args) {
        String content="Welcome to java class ";
        try(FileOutputStream fos=new FileOutputStream("outputStream.txt")){
            System.out.println("File Created sucessfully");
            byte[] bytes=content.getBytes();
            fos.write(bytes);
            System.out.println("Data created");
            fos.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
