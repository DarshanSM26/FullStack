import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {
        int grade;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the markls 1 to 100");
        int marks=sc.nextInt();
        grade=marks/10;
        switch (grade){
            case 10:
                System.out.println("A");
                break;
            case 9:
                System.out.println("B");
                break;
            case 8:
                System.out.println("C");
                break;
            case 7:
                System.out.println("D");
                break;
            case 6:
                System.out.println("F");
                break;
            default:
                System.out.println("ENter valid marks");
        }
    }
}
