class a{
    public a(int n){
        super();
        System.out.println("in A");
    }
}
class b extends a{
    public b(int n){
        super(n);
        System.out.println("in b int");
    }
}
public class thisAndSuper {
    public static void main(String[] args) {
        b obj = new b(23);
    }
}
