import java.util.Scanner;

public class ifelseif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(x>=y && x>=z){
            System.out.println(z+"is a large");
        }else if(y>=x && y>=z){
            System.out.println(y+"is a large");
        }else{
            System.out.println(z+"is large");
        }
    }
}
