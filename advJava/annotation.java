class aa{
    public void showTheDataThatBelongsHere(){
        System.out.println("In a show");
    }
}
class bb extends aa{
    @Override
    public void showTheDataThatBelongsHere(){
        System.out.println("in b show");
    }
}

public class annotation {
    public static void main(String[] args) {
        bb obj = new bb();
        obj.showTheDataThatBelongsHere();
    }
}
