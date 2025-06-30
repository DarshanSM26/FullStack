class Dog{
    String dname,dcolor;
    Dog(String name,String color){
        this.dname=name;
        this.dcolor=color;
    }
    void deatils(){
        System.out.println(dname+" "+dcolor);
    }
}
class babydog extends Dog{
    int age;
    babydog(String dname,String dcolor,int age){
        super(dname,dcolor);
        this.age=age;
    }
    void deatils(){
        super.deatils();
        System.out.println(age);
    }
}
public class SingleInheritanceAssigment {
    public static void main(String[] args) {
        babydog obj=new babydog("GS","White",10);
        obj.deatils();
    }
}
