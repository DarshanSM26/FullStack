import java.util.Scanner;

public class switchStatment {
    public static void main(String[] args) {
        int days;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers 1 tyo 7");
        switch (days=sc.nextInt()){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("tueday");
                break;
            case 4:
                System.out.println("Wesday");
                break;
            case 5:
                System.out.println("Thusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Satruday");
                break;
            default:
                System.out.println("Enter the valid number");
        }
    }
}
