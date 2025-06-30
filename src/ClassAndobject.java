class person
{
    /*String name="darshan";
    int age=21;*/
    String name;
    int age;
}
public class ClassAndobject {
    public static void main(String[] args) {
        person obj=new person();
        obj.name="Darshan";
        obj.age=21;
        System.out.println("person name =" +obj.name);
        System.out.println("Person age =" +obj.age);
    }
}
