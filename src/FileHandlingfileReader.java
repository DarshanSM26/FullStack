import java.io.FileReader;

public class FileHandlingfileReader {
    public static void main(String[] args) {
        String a="FileMethod";
        try(FileReader reader = new FileReader(a)){
            int Character;
            while ((Character = reader.read())!=-1){
                System.out.print((char) Character);
            }
            System.out.println();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
