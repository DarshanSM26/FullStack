import java.io.File;

public class File_Handling {
    public static void main(String[] args) throws Exception{
        String a="strive.pdf";
        File file = new File(a);
        if(file.createNewFile()){
            System.out.println("File created successfully");
        } else {
            System.out.println("try again");
        }
    }
}
