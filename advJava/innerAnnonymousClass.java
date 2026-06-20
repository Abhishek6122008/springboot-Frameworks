class am{
    public void show(){
        System.out.println("in a show");
    }
}
class bm{
    public void show(){
        System.out.println("in b show");
    }
}
public class innerAnnonymousClass {
    public static void main(String[] args) {
        am obj = new am()
            {
                public void show(){
                System.out.println("in a new show");
            }
        };
        obj.show();
        bm obj1 = new bm();
        obj1.show();
    }
}
