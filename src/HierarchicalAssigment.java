class CAR{
    String Color;
    CAR(String color){
        this.Color=color;
    }
    void deatils(){
        System.out.println(Color);
    }
}
class Bmw extends CAR{
    Double price;
    Bmw(String Color,Double price){
        super(Color);
        this.price=price;
    }
    void deatils(){
        super.deatils();
        System.out.println(price);
    }
}
class Audi extends CAR{
    Double price;
    Audi(String color,Double price){
        super(color);
        this.price=price;
    }
    @Override
    void deatils() {
        super.deatils();
        System.out.println(price);
    }
}
public class HierarchicalAssigment {
    public static void main(String[] args) {
        Bmw obj=new Bmw("Bule",200000d);
        Audi obj1=new Audi("Red",100000d);
        obj.deatils();
        obj1.deatils();
    }
}
