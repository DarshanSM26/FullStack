abstract class emplo{
    abstract void employee(String ename,int eid,Double salary);
    abstract void dep(String dname);
    void college(String cname){
        System.out.println(cname);
    }
}
class empperson extends emplo{
    @Override
    void employee(String ename, int eid, Double salary) {
           System.out.println(ename+" "+eid+" "+salary);
    }

    @Override
    void dep(String dname) {
        System.out.println(dname);
    }
}
public class AbstractClassexample {
    public static void main(String[] args) {
        empperson obj=new empperson();
        obj.employee("Darshan",1234,100000d);
        obj.dep("CSE");
        obj.college("Presidency");
    }
}
