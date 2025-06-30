interface college{
    public void Btech(String cname,int years,float perctage);
    public void PUC(String cname,int years,float perctage);
    public void TENth(String cname,int years,float perctage);
}
class college1 implements college{
    @Override
    public void Btech(String cname, int years, float perctage) {
        System.out.println("College Name :"+cname);
        System.out.println("how many years for Btech in your college :"+years);
        System.out.println("how much % u get in total year:"+perctage);
    }

    @Override
    public void PUC(String cname, int years, float perctage) {
        System.out.println("College Name :"+cname);
        System.out.println("how many years for PUC  in your college :"+years);
        System.out.println("how much % u get in total year:"+perctage);
    }

    @Override
    public void TENth(String cname, int years, float perctage) {
        System.out.println("College Name :"+cname);
        System.out.println("how many years for TENth in your college :"+years);
        System.out.println("how much % u get in total year:"+perctage);
    }
}
public class InterfaceCollege {
    public static void main(String[] args) {
        college1 obj=new college1();
        obj.Btech("presidency university",4,6.73f);
        obj.PUC("Govt PU College",2,67f);
        obj.TENth("KTSV",3,68f);

    }
}
