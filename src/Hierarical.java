class parentA{
    void demo(){
        System.out.println("Parent Class");
    }
}
class childB extends A{
    void demo(){
        System.out.println("Child ClassB");
    }
    void demo1(){
        System.out.println("extra child classB");
    }
}
class childC extends A{
    void demo(){
        System.out.println("Child ClassC");
    }
    void demo2(){
        System.out.println("extra child classC");
    }
}
public class Hierarical {
    public static void main(String[] args) {
        childB obj=new childB();
        obj.demo();
        obj.demo1();
        childC obj1=new childC();
        obj1.demo();
        obj1.demo2();
    }
}
