import java.util.ArrayList;
import java.util.List;

public abstract class Cat  {
    String name;
    int age;
    String gender;
    double price;
    String color;
    String kind;



    @Override
    public String toString() {
        return "品种["+this.kind+"] 姓名["+this.name+"] 年龄["+this.age+"岁] 颜色["+this.color+"]";
    }

    public Cat(String name, String color, int age, double price,String kind){
        this.name = name;
        this.color = color;
        this.age = age;
        this.price = price;
        this.kind = kind;
    }





}
