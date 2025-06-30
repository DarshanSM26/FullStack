class outer3{
    private int num=20;
    class inner3{
        public int getNum(){
            System.out.println("this is getnum method of the inner class");
            return num;
        }
    }
}
public class InnerClass3 {
    public static void main(String[] args) {
        outer3 obj=new outer3();
        outer3.inner3 obj1=obj.new inner3();
        System.out.println(obj1.getNum());
    }
}
