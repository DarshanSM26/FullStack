abstract class MAC{
    abstract void student(String sname, String sbranch);
}
abstract class MAC1{
    abstract void Employee(String ename,String role);
}
public class MultipleAnonomous {
    public static void main(String[] args) {
        MAC obj=new MAC() {
            @Override
            void student(String sname, String sbranch) {
                System.out.println(sname+" "+sbranch);
            }
        };
        obj.student("Darshan","COM");
        MAC1 obj1=new MAC1() {
            @Override
            void Employee(String ename, String role) {
                System.out.println(ename+" "+role);
            }
        };
        obj1.Employee("Shiva","FrontEnd Role");
    }
}
