import java.util.LinkedList;

public class CollectionsAssignmentLinkedList {
    public static void main(String[] args) {
        LinkedList<String> college=new LinkedList<>();
        System.out.println("Infromation about college");
        college.add(0,"PredencyUniversity");
        System.out.println(college);
        System.out.println("College Addrress");
        college.add(1,"NES");
        System.out.println(college);
        college.addFirst("Wlecome to ");
        System.out.println(college);
        college.add("presidencyuniversity.in");
        college.set(3,"560064");
        System.out.println(college);
        college.addLast("HOD of COM");
        System.out.println(college);
        college.contains("560064");
        System.out.println(college);
        college.getFirst();
        System.out.println(college);
        college.getLast();
        System.out.println(college);
        college.removeFirst();
        System.out.println(college);
        college.removeLast();
        System.out.println(college);
    }
}
