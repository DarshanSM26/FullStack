import java.util.Scanner;

class Student{
    private int id;
    public String name;
    void display(int id,String Name){
        System.out.println(name+" "+id);
    }
}
public class AssigmentAccessModifies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the deatils");
        String Name= sc.nextLine();
        int Id=sc.nextInt();
        Student obj=new Student();

    }
}
