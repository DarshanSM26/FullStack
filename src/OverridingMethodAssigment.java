class x{
    void config(){
        System.out.println("Parent class mobile: Oppo , 6GB RAM, 64Gb Storeage");
    }
}
class y extends x{
    void config(){
        System.out.println("child class  mobile: Redme11s , 8GB RAM, 128GB Storeage");
    }
}
public class OverridingMethodAssigment {
    public static void main(String[] args) {
        y obj=new y();
        obj.config();
    }
}
