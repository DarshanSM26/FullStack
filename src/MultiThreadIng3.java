class waterlevel implements Runnable{
    public void run() {
        try {
            for (int i = 0; i < 50; i += 10) {
                if (i == 10) {
                    System.out.println("10% water filled");
                    if (i == 20) {
                        System.out.println("20% water filled");
                        if (i == 30) {
                            System.out.println("30% water filled");
                            if (i == 40) {
                                System.out.println("40% water filled");
                                if (i == 50) {
                                    System.out.println("50 water filled");
                                } else {
                                    System.out.println("50% not filled");
                                }
                            } else {
                                System.out.println("40% not filled");
                            }
                        } else {
                            System.out.println("30%not filled");
                        }
                    } else {
                        System.out.println("20%not filled");
                    }
                } else {
                    System.out.println("10%not filled");
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

public class MultiThreadIng3 {
    public static void main(String[] args) throws Exception{
        Runnable obj=new waterlevel();
        Thread t1=new Thread(obj);
        t1.start();
        Thread.sleep(3000);
        
        

    }
}
