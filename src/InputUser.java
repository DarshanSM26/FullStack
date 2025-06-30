import java.util.Scanner;

class userinput1{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void sub(int a,int b){
        System.out.println(a-b);
    }
    public void mult(int a,int b){
        System.out.println(a*b);
    }
    public void div(int a,int b) {
        if (b != 0) {
            System.out.println(a / b);
        }
        else{
            System.out.println("Denomintor should not be zero");
        }
    }
    public void mod(int a,int b){
        System.out.println(a%b);
    }
}
public class InputUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the addition");
        int a=sc.nextInt();
        int b=sc.nextInt();
        userinput1 obj=new userinput1();
        obj.add(a,b);
        obj.sub(a,b);
        obj.mult(a,b);
        obj.div(a,b);
        obj.mod(a,b);

    }
}
