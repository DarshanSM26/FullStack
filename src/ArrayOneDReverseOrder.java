import java.util.Scanner;

public class ArrayOneDReverseOrder {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of elements=");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i=n-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}
