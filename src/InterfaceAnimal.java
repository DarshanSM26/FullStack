interface Animal{
    public void dog(String dname,String dbreed,String color);
    public void cat(String cname,String ccolor);
}
class Animal1 implements Animal{
    @Override
    public void dog(String dname, String dbreed, String color) {
        System.out.println(dname+" "+dbreed+" "+color);
    }

    @Override
    public void cat(String cname, String ccolor) {
        System.out.println(cname+" "+ccolor);
    }
}
public class InterfaceAnimal {
    public static void main(String[] args) {
        Animal1 obj = new Animal1();
        obj.dog("Rocky","GS","white");
        obj.cat("mumu","black");
    }
}
