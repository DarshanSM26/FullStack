abstract class anonomousclass2{
    abstract void dog(String dname,String dcolor);
    abstract void cat(String cname,String ccolor);
}
public class AnonomousClass1 {
    public static void main(String[] args) {
        anonomousclass2 obj =new anonomousclass2() {
            @Override
            void dog(String dname,String dcolor) {
                System.out.println(dname+" "+dcolor);
            }

            @Override
            void cat(String cname,String ccolor) {
                System.out.println(cname+" "+ccolor);
            }
        };
        obj.dog("Rocky","white");
        obj.cat("Memo","Black");
    }
}
