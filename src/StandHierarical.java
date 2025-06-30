class fruit1{
    String season;
    fruit1(String season){
        this.season=season;
    }
    void deatils(){
        System.out.println(season);
    }
}
class apple1 extends fruit1{
    String color;
    apple1(String season,String color){
        super(season);
        this.color=color;
    }
    void deatils(){
        super.deatils();
        System.out.println(color);
    }
}
class mango1 extends fruit1{
    Double price;
    mango1(String season, Double price){
        super(season);
        this.price=price;
    }
    void deatils(){
        super.deatils();
        System.out.println(price);
    }
}

public class StandHierarical {
    public static void main(String[] args) {
        apple1 obj=new apple1("Winter","Green");
        mango1 obj1=new mango1("Summar",1000d);
        obj.deatils();
        obj1.deatils();
    }
}
