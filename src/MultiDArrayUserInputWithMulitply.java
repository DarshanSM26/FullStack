import java.util.Scanner;
public class MultiDArrayUserInputWithMulitply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and cols:");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][] matrix1=new int[r1][c1];
        int[][] matrix2=new int[r2][c2];
        int[][] c=new int[r1][c1];
        System.out.println("Enter the elements to matrix");
        for(int i=0; i < matrix1.length; i++){
            for(int j=0;j<matrix1.length;j++){
               matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the 2nd matrix");
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1.length;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Multiple of matxix:");
        for (int i=0;i<matrix1.length;i++){
            for (int j=0;j<matrix1.length;j++){
                c[i][j]=0;
                for (int k=0;k<matrix1.length;k++){
                    c[i][j]=c[i][j]+matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        for (int i=0;i<matrix1.length;i++){
            for (int j=0;j<matrix1.length;j++){
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
