class MT extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Java develop");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class MT1 extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("rect develop");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {
       MT obj1=new MT();
       MT1 obj2=new MT1();
       obj1.start();
       obj2.start();

    }
}
