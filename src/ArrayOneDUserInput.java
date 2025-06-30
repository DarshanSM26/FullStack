import java.util.Scanner;

public class ArrayOneDUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array elements=");
        int n=sc.nextInt();
        System.out.println("Enter the array elements:");
        int array[]=new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
