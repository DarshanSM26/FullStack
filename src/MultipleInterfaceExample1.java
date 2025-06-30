interface vehicle1{
    void vehicle1(String vehicleNo,String color);
    void VSound(String sound);

}
interface cars extends vehicle1{
    void cars(String cname,String color,double price);
    void carsound(String csound);
}
interface bike extends vehicle1{
    void bike(String bname,double price,String EnggNo);
    void bikesound(String bsound);
}
class Darshan implements cars,bike{
    @Override
    public void vehicle1(String vehicleNo, String color) {
        System.out.println(vehicleNo+" "+color);
    }

    @Override
    public void VSound(String sound) {
        System.out.println(sound);
    }

    @Override
    public void cars(String cname, String color, double price) {
        System.out.println(cname+" "+color+" "+price);
    }

    @Override
    public void carsound(String csound) {
        System.out.println(csound);
    }

    @Override
    public void bike(String bname, double price, String EnggNo) {
        System.out.println(bname+" "+price+" "+EnggNo);
    }

    @Override
    public void bikesound(String bsound) {
        System.out.println(bsound);
    }

}
public class MultipleInterfaceExample1 {
    public static void main(String[] args) {
        Darshan obj=new Darshan();
        obj.vehicle1("KA024769","yellow");
        obj.VSound("Beep");
        obj.cars("Tata car","blue",90000d);
        obj.carsound("keykeykey");
        obj.bike("RX100",120000d,"BS4");
        obj.bikesound("Classic sound");
    }
}
