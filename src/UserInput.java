import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int total;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a values");
        int a=sc.nextInt();
        System.out.println("Enter b values");
        int b=sc.nextInt();
        total=a+b;
        System.out.println("Sum of total:"+total);
    }
}
