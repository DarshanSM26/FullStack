import java.io.FileInputStream;

public class FileHandlingFileInputStream {
    public static void main(String[] args) {
        String a="picture/demo1.png";
        try(FileInputStream fis = new FileInputStream(a)){
            int Character;
            while ((Character = fis.read())!=-1){
                System.out.print(Character);
            }
            System.out.println();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
