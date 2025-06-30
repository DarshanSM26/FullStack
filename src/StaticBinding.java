class calcuate{
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
}

public class StaticBinding {
    public static void main(String[] args) {
        System.out.println(calcuate.add(3,2));
        System.out.println(calcuate.add(4,3,2));
    }
}
