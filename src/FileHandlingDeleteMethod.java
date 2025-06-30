import java.io.File;

public class FileHandlingDeleteMethod {
    public static void main(String[] args) {
        File file = new File("jav.jpg");
        try{
            if(file.exists()){
                if(file.delete()){
                    System.out.println("File delete");
                } else{
                    System.out.println("File not deleted");
                }
            }else{
                System.out.println("file doest exists");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
