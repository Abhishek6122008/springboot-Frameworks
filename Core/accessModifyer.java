class A {
    protected int marks = 6;

    public void show() {
        System.out.println("Show method");
    }
}

class B {
    int marks = 10;
}

class C extends A {
    public void abc() {
        System.out.println(marks);
    }
}

public class accessModifyer {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        B obj1 = new B();
        System.out.println(obj1.marks);

        C obj2 = new C();
        obj2.abc();
    }
}