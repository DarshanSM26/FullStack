import java.util.Scanner;

public class MyDetails {
    public static void main(String[] args) {
        String name,branch,rollnumber;
        int age;
        float cgpa;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name");
        name=sc.nextLine();
        System.out.println("Enter the branch");
        branch=sc.nextLine();
        System.out.println("Enter the rollnumber");
        rollnumber=sc.nextLine();
        System.out.println("Enter the age");
        age=sc.nextInt();
        System.out.println("Enter the cgpa");
        cgpa=sc.nextFloat();
        System.out.println(" Student name "+ name + " Student branch "+ branch +" Student rollnumber "+ rollnumber +" Student age "+age+" Student cgpa "+cgpa);
    }
}
