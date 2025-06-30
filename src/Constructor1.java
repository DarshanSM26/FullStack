class construct{
    String name;
    int age;
    construct(String n,int a){
       /* name=n;
        age=a;*/
        this.name=n;
        this.age=a;

    }
    public void details(){
        System.out.println(name+" "+age);
    }
}
public class Constructor1 {
    public static void main(String[] args) {
        construct obj=new construct("darshan",21);
        obj.details();
    }
}
