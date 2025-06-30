class publicaccsess{
    public void display(){
        System.out.println("Hello");
    }
}
public class PublicAccessmodifies {
    public static void main(String[] args) {
        publicaccsess obj=new publicaccsess();
        obj.display();
    }
}
