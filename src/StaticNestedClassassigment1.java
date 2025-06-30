class assigmet{
    static class assigmet1{
        void add(int a,int b){
            System.out.println("Sum of add :"+ a+b);
        }
        void sub(int a,int b){
            System.out.println("Sub of sum :"+ (a-b));
        }
        void mul(int a,int b){
            System.out.println("Mul of sum :"+ a*b);
        }
        void div(int a,int b){
            System.out.println("Div of sum :"+ a/b);
        }
        void mod(int a,int b){
            System.out.println("mod of reamider :"+ a%b);
        }
        void postinc(int a){
            System.out.println("Post inc of value :"+a++);
        }
        void perinc(int b){
            System.out.println("Per inc of value :"+ --b);
        }
    }
}
public class StaticNestedClassassigment1 {
    public static void main(String[] args) {
        assigmet.assigmet1 obj = new assigmet.assigmet1();
        obj.add(4,5);
        obj.sub(4,5);
        obj.div(10,3);
        obj.mod(10,5);
        obj.perinc(3);
        obj.postinc(5);
        obj.mul(4,6);
    }
}
