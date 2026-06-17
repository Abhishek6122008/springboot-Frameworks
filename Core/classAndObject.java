class calculator{
    public int add(int num1,int num2){
        System.out.println(num1+num2);
        return-1;
    }
}
public class classAndObject {
    public static void main(String[] args) {
        calculator obj = new calculator();
        obj.add(23,7);
    }
}
