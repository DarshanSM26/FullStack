class person1
{
    String name="darshan";
    int age=21;
}
class dog{
    String name="Muuna";
    String color="brown";
    String breed="GS";
}
public class ClassAndObject1 {
    public static void main(String[] args) {
        person1 obj=new person1();
        System.out.println("person name="+obj.name);
        System.out.println("person age ="+obj.age);
        dog obj1=new dog();
        System.out.println("Dog name ="+ obj1.name);
        System.out.println("Dog colore ="+obj1.color);
        System.out.println("Dog breed ="+obj1.breed);
    }
}
