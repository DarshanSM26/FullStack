import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /* System.out.println("Enter your age");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Eligible for vote");
        }else{
            System.out.println("Better try next yesr");
        }*/
        System.out.println("Enter leap year=");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0)|| (year%1400==0)){
            System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }
    }
}
