class ReturnType{
    public void person(String name,int age){
        System.out.println(name+" "+age);
    }
    public void dog(String dname,String dcolor){
        System.out.println(dname+" "+dcolor);
    }
}
public class Withoutreturntype {
    public static void main(String[] args) {
        ReturnType obj=new ReturnType();
        obj.person("Darshan",21);
        obj.dog("Charli","white");
    }
}
