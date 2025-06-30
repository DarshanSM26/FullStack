class defaultaccess{
    void Display(){
        System.out.println("default");
    }
}
public class DefaultAccessmodifies {
    public static void main(String[] args) {
       defaultaccess obj=new defaultaccess();
       obj.Display();
    }
}
