class personouter{
   private class personinner{
        void demo(String name,int age){
            System.out.println(name+" "+age);
        }
    }
    void display(){
       personinner obj1=new personinner();
       obj1.demo("Darsham",21);
    }
}
public class innerclass1 {
    public static void main(String[] args) {
        personouter obj=new personouter();
        obj.display();
    }
}
