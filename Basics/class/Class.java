
import java.util.Scanner;

class car {
    private String color;
    private int price;
    public car(String color, int price)
    {
        this.color = color; this.price = price;
    }   

    public void show()
    {
        
        System.out.println("Color of car" + this.color);
        System.out.println("Price of car" + this.price);
    }
}

public class Class{
    public static void main(String[] args) {
        car p1 = new car("Rolls roy",13563567);
        p1.show();
        
    }
}
