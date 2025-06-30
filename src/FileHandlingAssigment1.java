import java.io.File;
import java.io.FileWriter;

public class FileHandlingAssigment1 {
    public static void main(String[] args) {
        String a="javafull.csv";
        File file=new File(a);
        try{
            if(file.createNewFile()){
                System.out.println("File created Successuly");
            }else{
                System.out.println("try again");
            }
            FileWriter writer = new FileWriter(a);
            writer.write("welcome to java Full Stack course");
            System.out.println("Data inserted successfully");
            writer.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
