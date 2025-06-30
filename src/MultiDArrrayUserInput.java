import java.util.Scanner;

public class MultiDArrrayUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and cols :");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] maxtrix1=new int[rows][cols];
        int[][] maxtrix2=new int[rows][cols];
        int[][] maxtrix3=new int[rows][cols];
        System.out.println("Enter the elements for 1st matrix: ");
        for(int i=0;i<maxtrix1.length;i++){
            for(int j=0;j<maxtrix1.length;j++){
                maxtrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements for 2nd matrix: ");
        for(int i=0;i<maxtrix2.length;i++){
            for(int j=0;j<maxtrix2.length;j++){
                maxtrix2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Addition of maxtrix:");
        for(int i=0;i<maxtrix2.length;i++){
            for(int j=0;j<maxtrix2.length;j++){
                maxtrix3[i][j]=maxtrix1[i][j]+maxtrix2[i][j];
            }
        }
        for(int i=0;i<maxtrix2.length;i++){
            for(int j=0;j<maxtrix2.length;j++){
                System.out.print(maxtrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
