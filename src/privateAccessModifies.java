class PrivateAccess{
    private String name="Darshan";
    private void Deatils(){
         System.out.println(name);
     }
      void Access(){                              //DefaultAccess
        Deatils();
     }
     public void access(){                         //publicAccess
        Deatils();
     }
}
public class privateAccessModifies {
    public static void main(String[] args) {
        PrivateAccess obj=new PrivateAccess();
        obj.Access();
        obj.access();
    }
}
