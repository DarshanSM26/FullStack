import java.util.Scanner;

public class Relationaloperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("equal to"+(a==b));
        System.out.println("not equal to"+(a!=b));
        System.out.println("greater than"+(a>b));
        System.out.println("less than"+(a<b));
        System.out.println("greater than or equal to"+(a>=b));
        System.out.println("less than or equal to"+(a<=b));
    }
}
