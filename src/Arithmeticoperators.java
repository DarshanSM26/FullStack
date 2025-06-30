import java.util.Scanner;

public class Arithmeticoperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a values");
        int a= sc.nextInt();
        System.out.println("Enter the b values");
        int b=sc.nextInt();
        System.out.println("Sum of number:"+(a+b));
        System.out.println("sub of number:"+(a-b));
        System.out.println("mul of number:"+(a*b));
        System.out.println("div of number:"+(a/b));
        System.out.println("mod of number:"+(a%b));
        System.out.println("pre increment of number:"+(++a));
        System.out.println("pre increment of number:"+(--a));
        System.out.println("pre increment of number:"+(++b));
        System.out.println("pre increment of number:"+(--b));
        System.out.println("post increment of number:"+(a++));
        System.out.println("post increment of number:"+(a--));
        System.out.println("post increment of number:"+(b++));
        System.out.println("pre increment of number:"+(b--));
    }
}
