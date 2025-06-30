class outerMLIC1{                                                   // Outer class in The Method Local Inner Class
    void show(){                                                    // Outer Class Method We declared
        class innerMLIC{                                            // Inner Class in The Method Local Inner Class
            void person(String name, int age){
                System.out.println(name+" "+age);
            }
            void dog(String dname, String color){
                System.out.println(dname+" "+color);
            }
        }
        innerMLIC obj1=new innerMLIC();
        obj1.person("Darshan",21);
        obj1.dog("GS","White");
    }
}
public class MethodLocalInnerClass1 {
    public static void main(String[] args) {
        outerMLIC1 obj=new outerMLIC1();
        obj.show();
    }
}
