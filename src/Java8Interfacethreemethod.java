import java.util.Scanner;

interface threemethod{
    void add(int a,int b);

}
interface threemethod1{
    void sub(int a,int b);
}
interface threemethod2{
    void mul(int a,int b);
}
/*class exteral implements threemethod{
    @Override
    public void add(int a,int b) {
        System.out.println("Sum of addition :" + (a+b));
    }

    @Override
    public void sub(int a,int b) {
        System.out.println("sub of addition :" + (a-b));
    }

    @Override
    public void mul(int a,int b) {
        System.out.println("mul of addition :" + (a*b));
    }
}*/
public class Java8Interfacethreemethod {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        exteral obj=new exteral();
        obj.add(a,b);
        obj.sub(a,b);
        obj.mul(a,b);*/
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        threemethod obj1=new threemethod() {
            @Override
            public void add(int a, int b) {
                System.out.println("Sum of addition :" + (a+b));
            }

            @Override
            public void sub(int a, int b) {
                System.out.println("Sum of addition :" + (a-b));
            }

            @Override
            public void mul(int a, int b) {
                System.out.println("Sum of addition :" + (a*b));
            }
        };
        obj1.add(a,b);
        obj1.sub(a,b);
        obj1.mul(a,b);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 values");
        int p=sc.nextInt();
        int q=sc.nextInt();
        threemethod obj=(a,b) -> System.out.println(a+b);
        threemethod1 obj1=(a,b) -> System.out.println(a-b);
        threemethod2 obj2=(a,b)-> System.out.println( a*b);
        obj.add(p,q);
        obj1.sub(p,q);
        obj2.mul(p,q);
    }
}
