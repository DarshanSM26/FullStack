class outerstatic{
    static class innerstatic{
        void demo(){
            System.out.println("Static class");
        }
    }
}
public class StaticNestedClass {
    public static void main(String[] args) {
        outerstatic.innerstatic obj=new outerstatic.innerstatic();
        obj.demo();
    }
}
