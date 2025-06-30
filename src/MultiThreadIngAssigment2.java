class chat implements Runnable{
    String user;
    String[] message;
    chat(String user,String[] message){
        this.user=user;
        this.message=message;
    }
    public void run() {
        for(String msg : message) {
            System.out.println(user + " : " + msg);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class MultiThreadIngAssigment2 {
    public static void main(String[] args) {
        String[] user1={"hi","How are you?","where are you from","are you missing banglore"};
        String[] user2={"hi bro","im fine","in banglore","alot"};

        Runnable obj1=new chat("Darshan",user1);
        Runnable obj2=new chat("shiva",user2);

        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);

        t1.start();
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
