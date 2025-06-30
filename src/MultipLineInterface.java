interface assig{
    void add(int a,int b);
}
class work implements assig{
    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }
    public  void Multi(int a,int b,int c){
        System.out.println(a*b*c);
    }
}
class home implements  assig{
    public void add(int a, int b) {
        System.out.println(a+b);
    }
    public  void Multi(int a,int b,int c){
        System.out.println(a*b*c);
    }
}
public class MultipLineInterface {
    public static void main(String[] args) {
        work obj=new work();
        obj.add(3,4);
        obj.Multi(2,4,6);
        home obj1=new home();
        obj1.add(5,6);
        obj1.Multi(3,6,8);
    }
}
