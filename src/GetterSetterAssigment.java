class employeee{
    private String ename="Darshan";
    private int eid=202110040;
    private double esalary=12000d;

    public void setEname(String ename) {
        this.ename = ename;}
    public void setEid(int eid) {
        this.eid = eid;}
    public void setEsalary(double esalary) {
        this.esalary = esalary;}
    public String getEname() {
        return ename;}
    public int getEid() {
        return eid;}
    public double getEsalary() {
        return esalary;
    }
}
public class GetterSetterAssigment {
    public static void main(String[] args) {
        employeee obj=new employeee();
        obj.setEname("Shiva");
        obj.setEid(23232);
        obj.setEsalary(12300);
        System.out.println(obj.getEname()+" "+obj.getEid()+" "+obj.getEsalary());
    }
}
