import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        String ename, cname,depname;
        double salary;
        int eid;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee name");
        ename= sc.nextLine();
        System.out.println("Enter the Company name");
        cname=sc.nextLine();
        System.out.println("Enter the Depname");
        depname=sc.nextLine();
        System.out.println("Enter the Employee id");
        eid=sc.nextInt();
        System.out.println("Enter the salary");
        salary=sc.nextDouble();
        System.out.println("Employee name :"+ename);
        System.out.println("Employee company name :"+cname);
        System.out.println("Employee DEPname :"+depname);
        System.out.println("Employee Eid :"+eid);
        System.out.println("Employee Salary :"+salary);
    }
}
