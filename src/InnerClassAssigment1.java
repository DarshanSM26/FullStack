class outerclss{
    private class innerclss{
        void car(String cname,String CNumber){
            System.out.println(cname+" "+CNumber);
        }
    }
    public void display(){
        innerclss obj1=new innerclss();
        obj1.car("Tata","KA02AK4769");
    }
}
public class InnerClassAssigment1 {
    public static void main(String[] args) {
        outerclss obj=new outerclss();
        obj.display();
    }
}
