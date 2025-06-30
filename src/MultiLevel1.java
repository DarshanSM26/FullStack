class animal{
    String color;
    String type;

    animal(String c,String t){
        this.color=c;
        this.type=t;
    }
    void deatils(){
        System.out.println(color+" "+type);
    }
}
class dogs extends animal{
    String name;
    dogs(String c,String t,String n){
        super(c,t);
        this.name=n;
    }
    void deatils(){
        super.deatils();
        System.out.println(name);
    }
}
class badydog extends dogs{
    String gender;
    badydog(String c,String t,String n,String g){
        super(c,t,n);
        this.gender=g;
    }
    void deatils(){
        super.deatils();
        System.out.println(gender);
    }
}
public class MultiLevel1 {
    public static void main(String[] args) {
        badydog obj=new badydog("black","carnivorous","GS","Male");
        obj.deatils();
    }
}
