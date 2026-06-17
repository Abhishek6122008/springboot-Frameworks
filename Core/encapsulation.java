class human{
    private int age;
    private String name;

    public human(){
        age = 12;
        name = "John";
    }
    public human(int a, String n){
        age = a;
        name = n;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        human obj = new human(24,"hanumanji");
//        obj.age = 22;
//        obj.name = "abhi";

//        obj.setName("hello");
//        obj.setAge(42);
        System.out.println(obj.getAge() + obj.getName());
    }
}
