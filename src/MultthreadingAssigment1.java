class Taffic extends Thread{
    String color;
    String[] trffic;
    Taffic(String color,String[] trffic){
        this.color=color;
        this.trffic=trffic;
    }
    public void run(){
        for (String meg : trffic) {
            System.out.println(color + " : " + meg);
            try {
                Thread.sleep(2000);

            } catch (Exception e) {

            }
        }
    }
}
public class MultthreadingAssigment1 {
    public static void main(String[] args) {
        String[] red={" stop the car ","if red sinal dont cross the road"};
        String[] yellow={" Ready to move","once yellow gone move the car"};
        String[] Green={"Start the car","Start moving the car dont stop"};
        Thread t1=new Taffic("Red :",red);
        Thread t2=new Taffic("Yellow :",yellow);
        Thread t3=new Taffic("Green",Green);
        t1.start();
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e);
        }
        t2.start();
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e);
        }
        t3.start();
    }
}
