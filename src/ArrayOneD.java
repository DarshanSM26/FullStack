public class ArrayOneD {
    public static void main(String[] args) {
        int array[]={2,4,6,7,8,9};
        array[3]=15;                            // to modify the array value
        for (int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
