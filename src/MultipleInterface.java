interface mutiA{
    void add();
}
interface mutiB{
    void sub();
}
class mutiC implements mutiA,mutiB{
    public void add(){
        System.out.println("parent 1");
    }
    public void sub(){
        System.out.println("parent 2");
    }
}
public class MultipleInterface {
    public static void main(String[] args) {
        mutiC obj = new mutiC();
        obj.add();
        obj.sub();
    }
}
