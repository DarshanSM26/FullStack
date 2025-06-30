class employeeouter{
    private class employeeinner{
        void emp(String ename,String eid){
            System.out.println(ename+" "+eid);
        }
        void dept(String dname,String did){
            System.out.println(dname+" "+did);
        }
    }
    void display(){
        employeeinner obj1=new employeeinner();
        obj1.emp("Darshan","20211EMP0040");
        obj1.dept("CSE","CSE1002");
    }
}
public class innerClass2 {
    public static void main(String[] args) {
        employeeouter obj=new employeeouter();
        obj.display();
    }
}
