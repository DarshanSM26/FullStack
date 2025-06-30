class car{
    String Cname,Ccolor;
    int Cmodle;
    Double Cprice;
    car(String cname,int cmodle,String ccolor,Double price){
        Cname=cname;
        Cmodle=cmodle;
        Ccolor=ccolor;
        Cprice=price;
    }
    public void vehicle(){
        System.out.println(Cname+" "+Cmodle+" "+Ccolor+" "+Cprice);
    }
}
public class Vehicle {
    public static void main(String[] args) {
        car obj1=new car("BMW",2003,"Black",100000d);
        car obj2=new car("TATAcar",2024," ",200000d);
        obj1.vehicle();
        obj2.vehicle();
    }
}
