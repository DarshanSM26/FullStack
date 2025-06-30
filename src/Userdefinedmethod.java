class Addition{
    public void sum(int a,int b){
        System.out.println("addition " + (a+b));        //without return type
    }
    public int sub(int a,int b){
        return a-b;                                    //with return type
    }
}
public class Userdefinedmethod {
    public static void main(String[] args) {
        Addition obj=new Addition();
        obj.sum(3,5);
        int res=obj.sub(3,5);
        System.out.println("subbition " + res);
    }
}
