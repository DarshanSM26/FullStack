import java.util.Scanner;

interface perso{
    void person(String name,int age, String address);
}
public class Java8Threevariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String sname=sc.next();
        System.out.println("Enter the age");
        int sage=sc.nextInt();
        System.out.println("Enter the address");
        String Address=sc.next();
        perso obj=((name, age, address) -> System.out.println(name+age+address));
        obj.person(sname,sage,Address);
    }
}
