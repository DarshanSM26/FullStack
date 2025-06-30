class studentread{
    private String sname="darshan";
    private String sbranch="COM";
    private String srollno="20211COM0040";
    private String address="Hebbal";


    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setSbranch(String sbranch) {
        this.sbranch = sbranch;
    }

    public void setSrollno(String srollno) {
        this.srollno = srollno;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSname() {
        return sname;
    }

    public String getSbranch() {
        return sbranch;
    }

    public String getSrollno() {
        return srollno;
    }

    public String getAddress() {
        return address;
    }
}
public class GetterSetterMethod {
    public static void main(String[] args) {
        studentread obj=new studentread();
        obj.setSname("Shiva");
        obj.setSbranch("CSE");
        obj.setSrollno("20211cse0034");
        obj.setAddress("NES");
        System.out.println(obj.getSname()+" "+obj.getSbranch()+" "+obj.getSrollno()+" "+obj.getAddress());
    }
}
