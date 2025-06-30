interface lab{
    void demo(int a,String name);
}
public class Java8lambia {
    public static void main(String[] args) {
        lab obj=(a,name) -> System.out.println("Hello word " + a + name);
        obj.demo(21,"Darshan");
    }
}
