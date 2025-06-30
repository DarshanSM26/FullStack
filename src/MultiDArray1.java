public class MultiDArray1 {
    public static void main(String[] args) {
        int[][] array={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(" 1st diagonal:");
        for(int i=0;i< array.length;i++){
            System.out.println(array[i][i]);
        }
        System.out.println("2nd diagonal:");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i][array.length-1-i]);
        }
    }
}
