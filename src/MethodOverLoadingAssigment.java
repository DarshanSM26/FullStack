import java.util.Scanner;
class Assigment{
    public void Number(float a,float b){
        System.out.println(a+b);}
    public void Number(float a,float b,float c){
        System.out.println(a+b+c);}}
public class MethodOverLoadingAssigment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a");
        float a=sc.nextFloat();
        System.out.println("Enter the b");
        float b=sc.nextFloat();
        System.out.println("Enter the c");
        float c=sc.nextFloat();
        Assigment obj=new Assigment();
        obj.Number(a,b);
        obj.Number(a,b,c);
    }
}
