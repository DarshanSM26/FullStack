import java.util.ArrayList;
import java.util.List;
public class CollectionsAssignementArraylist1 {
    public static void main(String[] args) {
        List<String> student=new ArrayList<>();
        student.add("Darshan");
        student.add("SM");
        student.add("8884490770");
        student.add("darshansm0@gmail.com");
        student.add("Btech");
        System.out.println(student);
        student.add(4,"COM");
        System.out.println(student);
        System.out.println(student.size());
        System.out.println(student.get(4));
        System.out.println(student.set(1,"sake"));
        System.out.println(student);
        System.out.println(student.contains("Darshan"));
        System.out.println(student.remove(1));
    }
}
