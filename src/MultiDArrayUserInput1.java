import java.util.Scanner;

public class MultiDArrayUserInput1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and cols:");
        int row=sc.nextInt();
        int cols=sc.nextInt();
        int[][] matrix=new int[row][cols];
        int[][] transpose=new int[cols][row];
        System.out.println("Enter the elements to matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("Transpose matrix:");
        for (int j=0;j<cols;j++){
            for (int i=0;i<row;i++){
                System.out.print(transpose[j][i]+" ");
            }
            System.out.println();
        }
    }
}
