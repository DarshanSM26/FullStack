import java.util.Scanner;

class chatUser extends Thread{
    String user;
    String[] message;
    chatUser(String user,String[] message){
        this.user=user;
        this.message=message;
    }
    public void run() {
            for (String meg : message) {
                System.out.println(user+":"+meg);
                try{
                    Thread.sleep(2000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class MultIThreadingUserInteract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start the chat");
        System.out.println("Darshan will start");
        String dar= sc.next();
        System.out.println("sanjay will reply");
        String sanj=sc.next();
        /*String[] user1meg={"Hi","How are you?","Where are you from"};
        String[] user2meg={"hai","Im fine","in Banglore"};*/

        String[] user1meg={dar};

        String[] user2meg={sanj};

        Thread t1=new chatUser("Darshan",user1meg);
        Thread t2=new chatUser("Sanjay",user2meg);

        t1.start();
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
