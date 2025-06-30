import java.util.Scanner;

class overload1{
    public void student(String sname,String Branch){
        System.out.println(sname+" "+Branch);
    }
    public void student(String sname,String Branch,String address){
        System.out.println(sname+" "+Branch+" "+address);
    }
}
public class MethodoverloadingExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        overload1 obj=new overload1();
        System.out.println("Enter the student name");
        String name= sc.nextLine();
        System.out.println("Enter the student branch");
        String branch= sc.nextLine();
        System.out.println("Enter the student address");
        String address= sc.nextLine();
        obj.student(name,branch);
        obj.student(name,branch,address);
    }
}
