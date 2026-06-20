abstract class computeer{
    public abstract void code();
        }
class laptop extends computeer{
    public void code(){
        System.out.println("code,compile,run");
    }
}
class desktop extends computeer{
    public void code(){
        System.out.println("code,compile,run");
    }
}
class dev{
    public void devApp(computeer lap){
        lap.code();
    }
}
public class needOfInterface {
    public static void main(String[] args) {
        computeer lap = new laptop();
        dev obj = new dev();
        computeer desk = new desktop();
        obj.devApp(desk);
    }
}
