class outerMLIC{            //Outer Class Method Local  Inner Class
    void show(){
        class innerMLIC{
            public void display(){                                   // Inside the Inner class we declare method
                System.out.println("Method Local Inner Class");
            }
        }
        innerMLIC obj1=new innerMLIC();
        obj1.display();
    }
}
public class MethodLocalInnerClass {
    public static void main(String[] args) {
        outerMLIC obj=new outerMLIC();
        obj.show();
    }
}
