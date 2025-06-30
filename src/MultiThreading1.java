class Thread1 extends Thread{
    public void run()
    {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Red: You need stop");
                Thread.sleep(2000);
            }

        } catch(Exception e){
            System.out.println(e);
        }

    }
}
class Thread2 extends Thread{
    public void run()
    {
        try{
            for(int i=0;i<5;i++) {
                System.out.println("Yellow or Orange: You Can Start your vehicle");
                Thread.sleep(2000);
            }

        } catch (Exception e){
            System.out.println(e);
        }
    }

}
class Thread3 extends Thread{
    public void run()
    {
        try{
            for(int i=0;i<5;i++) {
                System.out.println("Green: You can Go");
                Thread.sleep(2000);
            }

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
public class MultiThreading1 {
    public static void main(String[] args) throws Exception {
        Thread obj1 = new Thread1();
        Thread obj2 = new Thread2();
        Thread obj3 = new Thread3();
        obj1.start();
        Thread.sleep(1000);
        obj2.start();
        Thread.sleep(1000);
        obj3.start();
        Thread.sleep(1000);

    }
}