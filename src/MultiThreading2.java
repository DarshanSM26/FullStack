class MT12 extends Thread{
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
class MT123 extends Thread{
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
public class MultiThreading2 {
    public static void main(String[] args) {
        Thread obj1=new MT12();
        Thread obj2=new MT123();
        obj1.start();
        obj2.start();
    }
}
