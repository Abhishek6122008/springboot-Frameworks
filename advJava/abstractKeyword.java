abstract class car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("play music");
    }
}
abstract class WagonR extends car {
    public void drive() {
        System.out.println("driving");
    }
    public abstract void fly();
}
class updatedWagonR extends WagonR{
    public void fly(){
        System.out.println("flying");
    }
}
public class abstractKeyword {
    public static void main(String[] args) {
        updatedWagonR obj = new updatedWagonR();
        obj.drive();
        obj.playMusic();
    }
}
