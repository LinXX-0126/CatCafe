import java.util.ArrayList;
import java.util.List;

public class BlackCat extends Cat{
    static double price = 350;
    static String kind = "BlackCat";

    public BlackCat(String name, String color, int age, double price,String kind) {
        super(name, color, age, price,kind);
        this.price = price;
    }


}
