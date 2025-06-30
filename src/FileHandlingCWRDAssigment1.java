import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class FileHandlingCWRDAssigment1 {
    public static void main(String[] args) {
      String a= "error.txt";
        File file = new File(a);
        try {
            if (file.createNewFile()) {
                System.out.println("Created Successfully");
            } else {
                System.out.println("Try again");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            FileWriter writer = new FileWriter(a);
            writer.write("Welcome to learn file handling");
            System.out.println("Data inserted successfully");
            writer.close();
        }catch (Exception e){
            System.out.println(e);
        }

        try(FileReader reader = new FileReader(a)){
            int Character;
            while ((Character = reader.read())!=-1){
                System.out.print((char) Character);
            }
            System.out.println();
        }catch (Exception e){
            System.out.println(e);
        }

        try{
            if(file.exists()){
                if(file.delete()){
                    System.out.println("file deleted");
                }else{
                    System.out.println("file not found");
                }
            }
            else {
                System.out.println("file doest not work");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
