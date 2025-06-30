import java.util.Scanner;

public class ArrayOneDUserInput1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of Elements=");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int max=array[0];
        for(int i=1;i<n;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("max elements in a array:"+max);
    }
}
