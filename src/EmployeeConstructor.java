class employee1{
    String empname,role;
    Double salary;
    employee1(String ename,String erole,Double esalary){
        this.empname=ename;
        this.role=erole;
        this.salary=esalary;
    }
    public void deatils(){
       System.out.println(empname+" "+role+" "+salary);
    }
}
public class EmployeeConstructor {
    public static void main(String[] args) {
        employee1 obj=new employee1("Darshan","software",25000d);
        obj.deatils();
    }
}
