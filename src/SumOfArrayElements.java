public class SumOfArrayElements {
    public static void main(String[] args) {
        int a[]={2,3,4,5,6,7,8};
        for (int i=0;i<a.length; i++){
            System.out.println(a[i]);
        }
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("Sum of Array elements :"+sum);
    }

}
