class personread{
    private String name="darshan";
    private int age=21;

    public void setName(String name) {       //setmethod is to change the data
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {                      //get method used to felted data
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class ReadonlyMethod {
    public static void main(String[] args) {
        personread obj=new personread();
        obj.setName("Shiva");
        obj.setAge(23);
        System.out.println(obj.getName()+" "+obj.getAge());
    }
}
