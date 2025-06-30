interface stuperson{
    static void person(String name,int age){
        System.out.println(name+" "+age);
    }
    default void display(String name,int age){
        System.out.println(name+" "+age);
    }
}
class studentchild implements stuperson{
    @Override
    public void display(String name, int age) {
        //stuperson.super.display(name, age);
        System.out.println(name+" "+age);
    }
}
public class StaticAndDefaultAssigment {
    public static void main(String[] args) {
        stuperson.person("darshan",21);
        studentchild obj=new studentchild();
        obj.display("shiva",22);
    }
}
