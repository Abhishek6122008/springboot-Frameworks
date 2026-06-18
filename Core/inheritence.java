class advCalc{
    public int multi(int n1,int n2){
        return n1*n2;
    }
    public int div(int n1,int n2){
        return n1/n2;
    }
}
class veryAdvCalc extends advCalc{
    public double pow(int n1,int n2){
        return Math.pow(n1,n2);
    }
}
public class inheritence {
    public static void main(String[] args) {
        veryAdvCalc calc = new veryAdvCalc();
        System.out.println(calc.pow(2,2));
        System.out.println(calc.multi(2,2));
    }
}
