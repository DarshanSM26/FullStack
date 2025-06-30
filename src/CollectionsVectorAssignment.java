import java.util.Vector;

public class CollectionsVectorAssignment {
    public static void main(String[] args) {
        Vector<String> course=new Vector<>();
        course.add("CSe");
        course.add("PPS");
        course.add("mech");
        System.out.println(course);
        course.add(1,"ECE");
        System.out.println(course);
        course.add(3,"EEE");
        System.out.println(course);
        course.add("Soft Skills");
        System.out.println(course);
        System.out.println(course.size());
        System.out.println(course.contains("Soft skill"));
        System.out.println(course.get(3));
        course.clear();
        System.out.println(course);
    }
}
