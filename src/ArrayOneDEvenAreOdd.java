import java.util.Scanner;

public class ArrayOneDEvenAreOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of elements=");
        int n=sc.nextInt();
        int a[]=new int[5];
        int even=0,odd=0;
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("even count :"+even);
        System.out.println("odd count :"+odd);
    }
}
