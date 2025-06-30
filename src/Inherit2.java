class car1{
    String model,color;
    car1(String model,String color){
        this.model=model;
        this.color=color;
    }
    void cardeatils(){
        System.out.println(model+" "+color);
    }
}
class bmw extends car1{
    String fueltype;
    bmw(String model,String color,String fueltype){
        super(model,color);
        this.fueltype=fueltype;
    }
    void bmwdeatils(){
        System.out.println(model+" "+color+" "+fueltype);
    }
}
public class Inherit2 {
    public static void main(String[] args) {
        bmw obj=new bmw("2020","blue","pertol");
        car1 obj1=new car1("2020","black");
        obj.bmwdeatils();
        obj1.cardeatils();
    }
}
