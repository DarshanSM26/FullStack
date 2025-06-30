class OuterMLCA{
    void show() {
        class innerMLCA {
             void dog(String name,String color){
                 System.out.println(name+" "+color);
             }
        }
        innerMLCA obj1=new innerMLCA();
        obj1.dog("Rocky","white");
    }
}
public class MethidLocalClassAssigment1 {
    public static void main(String[] args) {
        OuterMLCA obj=new OuterMLCA();
        obj.show();
    }
}
