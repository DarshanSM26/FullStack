import java.util.Scanner;

public class dowhilenaturalnumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number range");
        int num=sc.nextInt();
        int i=1;
        int sum=0;
        do {
            sum=sum+i;
            i++;
        }while(i<=num);
        System.out.println(sum);
    }
}
