import java.io.File;
import java.io.FileWriter;

public class FileHandlingFileWrite {
    public static void main(String[] args) {
        String a="Tata.txt";
        File file =new File(a);
        try{
            FileWriter writer=new FileWriter(file);
            writer.write("Welcome to java class ");
            writer.write("Today topic was handling class is file handling concept");
            System.out.println("data inserted successfully");
            writer.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
