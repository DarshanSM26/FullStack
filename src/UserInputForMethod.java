import java.util.Scanner;

class UserInputtype{
    public  void person(String name,int age){
        System.out.println(name+" "+age);
    }
    public  void dog(String dname,String dcolor){
        System.out.println(dcolor+" "+dcolor);
    }
}
public class UserInputForMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the person name and age");
        String name=sc.nextLine();
        //int age=sc.nextInt();
        System.out.println("Enter the dog name and color");
        String dname=sc.nextLine();
        String dcolor=sc.nextLine();
        int age=sc.nextInt();
        UserInputtype obj=new UserInputtype();
        obj.person(name,age);
        /*System.out.println("Enter the dog name and color");
        String dname=sc.nextLine();
        String dcolor=sc.nextLine();*/
        obj.dog(dname,dcolor);
    }
}
