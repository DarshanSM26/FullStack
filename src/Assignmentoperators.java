import java.util.Scanner;

public class Assignmentoperators {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 2 Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("+="+(a+=b));
        System.out.println("-="+(a-=b));
        System.out.println("*="+(a*=b));
        System.out.println("/="+(a/=b));
        System.out.println("%="+(a%=b));
        System.out.println("<<="+(a<<=b));
        System.out.println(">>="+(a>>=b));
        System.out.println("&="+(a&=b));
        System.out.println("^="+(a^=b));
    }
}
