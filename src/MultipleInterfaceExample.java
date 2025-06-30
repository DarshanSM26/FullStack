interface dog1{
    void dog(String dname,String breed,String dcolor);
}
interface cat{
    void cat(String cname,String ccolor);
}
class CAD implements dog1,cat{
    public void dog(String dname, String breed,String dcolor){
        System.out.println(dname+" "+breed+" "+dcolor);
    }
    public void cat(String cname,String ccolor){
        System.out.println(cname+" "+ccolor);
    }
}
public class MultipleInterfaceExample {
    public static void main(String[] args) {
        CAD obj=new CAD();
        obj.dog("Muun","GS","White");
        obj.cat("Mewo","brown");
    }
}
