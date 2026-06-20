class in{
    int age;
    public void show(){
        System.out.println("is showing");
    }
    static class inb{
        public void config(){
            System.out.println("in config");
        }
    }
}

public class innerClasss {
    public static void main(String[] args) {
        in obj = new in();
        obj.show();
        in.inb obj1 = new in.inb();
        obj1.config();
    }
}
