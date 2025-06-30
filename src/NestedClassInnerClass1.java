class outer{
    class inner{
        private void demo(){
            System.out.println("inner private class");
        }
    }
    void display(){
        inner obj1=new inner();
        obj1.demo();
    }
}
public class NestedClassInnerClass1 {
    public static void main(String[] args) {
        outer obj=new outer();
        obj.display();
    }
}
