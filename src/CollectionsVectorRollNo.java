import java.util.List;
import java.util.Vector;

public class CollectionsVectorRollNo {
    public static void main(String[] args) {
        Vector<String> rollno=new Vector<>();
        rollno.add("202");
        rollno.add("11");
        rollno.add("com");
        rollno.add("00");
        rollno.set(2,"COM");
        rollno.add("40");
        System.out.println(rollno);
        rollno.remove(3);
        System.out.println(rollno);
        System.out.println(rollno.get(2));
        }
}
