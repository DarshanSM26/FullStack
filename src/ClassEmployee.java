import java.util.Scanner;

class Employee{
    String ename,eid;
    double esalary;
}
class Department{
    String dname;
    int did;
}
public class ClassEmployee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee");
        
        Employee obj=new Employee();
        obj.ename="Darshan";
        obj.eid="123dar";
        obj.esalary=100000d;
        System.out.println("Employee name "+ obj.ename);
        System.out.println("Employee id "+ obj.eid);
        System.out.println("Employee salary "+ obj.esalary);
        Department obj1=new Department();
        obj1.dname="Software";
        obj1.did=1234;
        System.out.println("Department name"+obj1.dname);
        System.out.println("Department id"+obj1.did);

    }
}
