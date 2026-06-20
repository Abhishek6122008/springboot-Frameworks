enum LLaptop {
    Mackbook(2000),
    XPS(2200),
    Surface(1500),
    ThinkPad(1800);

    private int price;

    LLaptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class enumLaptop {
    public static void main(String[] args) {

        for (LLaptop lap : LLaptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}