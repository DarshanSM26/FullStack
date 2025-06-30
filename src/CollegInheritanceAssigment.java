class College{
    String cname,caddress;
    College(String cname,String caddress){
        this.cname=cname;
        this.caddress=caddress;
    }
    void display(){
        System.out.println(cname+" "+caddress);
    }
}
class dept extends College{
    String dname,tname;
    dept(String cname,String dname,String caddress,String tname){
        super(cname,caddress);
        this.tname=tname;
        this.dname=dname;
    }

    @Override
    void display() {
        super.display();
        System.out.println(tname+" "+dname);
    }
}
class student extends dept{
    String sname,rollno;
    student(String cname,String dname,String caddress,String tname,String sname,String rollno){
        super(cname,dname,caddress,tname);
        this.sname=sname;
        this.rollno=rollno;
    }

    @Override
    void display() {
        super.display();
        System.out.println(sname+" "+rollno);
    }
}
public class CollegInheritanceAssigment {
    public static void main(String[] args) {
        student obj=new student("Presidency","Cse","hebbal","Sanjy","darshan","20211com0040");
        obj.display();
    }
}
