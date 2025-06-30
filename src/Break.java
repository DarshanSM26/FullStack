public class Break {
    public static void main(String[] args) {
        int x=10;
        while(x<20){
            if(x==15){
                break;
            }else{
                System.out.println(x);
                x++;
            }
        }
    }
}
