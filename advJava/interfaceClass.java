interface im{
    void show();
    void config();
    int age = 55;
    String area = "Mumbai";
}
interface x{
    void run();
}

class ib implements im,x{
    public void show() {
        System.out.println("show");
    }
    public void config() {
        System.out.println("config");
    }
    public void run(){
        System.out.println("running");
    }
}

public class interfaceClass {
    public static void main(String[] args) {
        im obj;
        obj = new ib();
        obj.show();
        obj.config();
        System.out.println(im.area);
        System.out.println(im.age);
    }
}
