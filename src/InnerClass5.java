class outer5{
    class inner5{
        String name="darshan";
        public String getName(){
            System.out.println("The the name of person");
            return name;
        }
    }
}
public class InnerClass5 {
    public static void main(String[] args) {
        outer5 obj=new outer5();
        outer5.inner5 obj1=obj.new inner5();
        System.out.println(obj1.getName());
    }
}
