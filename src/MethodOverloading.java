import java.util.Scanner;

class overload{
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a");
        int a= sc.nextInt();
        System.out.println("Enter the b");
        int b=sc.nextInt();
        System.out.println("Enter the c");
        int c=sc.nextInt();
        overload obj=new overload();
        obj.add(a,b);
        obj.add(a,b,c);
    }
}
