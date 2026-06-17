class computer{
    public void playMusic(){
        System.out.println("playing music");
    }
    public String getMeAPen(int cost){
        if(cost>=10) {
            return "Pen";
        }else{
            return "Nothing";
        }
    }
}
public class methods {
    public static void main(String[] args) {
        computer comp = new computer();
        String str = comp.getMeAPen(9);
        System.out.println(str);
        comp.playMusic();

    }
}
