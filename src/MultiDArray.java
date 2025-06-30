public class MultiDArray {
    public static void main(String[] args) {
        int [][] array={{1,2,3},{2,3,4},{4,5,6}};
        for(int i=0;i<array.length;i++){
            for( int j=0;j<array.length;j++){                    //rows
                System.out.print(array[i][j]+" ");             //col
            }
            System.out.println();

        }
    }
}
