class outer4{
    private class inner4{
        void getvalue(String name){
            System.out.println(name);
        }
    }
    void display(){
        inner4 obj1=new inner4();
        obj1.getvalue("Darshan");
    }
}
public class InnerClass4 {
    public static void main(String[] args) {
        outer4 obj=new outer4();
        obj.display();
    }
}
