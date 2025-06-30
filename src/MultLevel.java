class A{
    void show(){
        System.out.println("A");
    }
}
class B extends A{
    void show(){
        System.out.println("B");
    }
    void display(){
        System.out.println("B display");
    }
}
class C extends B{
    void show(){
        System.out.println("C");
    }
    void display(){
        System.out.println("C display");
    }
    void greeting(){
        System.out.println("Greeting");
    }
}
public class MultLevel {
    public static void main(String[] args) {
        C obj=new C();
        obj.show();
        obj.display();
        obj.greeting();
    }
}
