

abstract class base {
    abstract void m1();
    abstract void m2();

}

class derived extends base{
    int x;
    void m1()
    {
        System.out.println("X = " + x + " m1 method\n");
    }
    void m2()
    {
        System.out.println("X = " + x + " m2 method\n");
    }
    derived(int x)
    {
        this.x = x;
    }
}

class derived1 extends derived{
    
    derived1(int x)
    {
        super(x);
    }    
}

public class p2
{
    public static void main(String[] args) {
        derived p = new derived(2);
        p.m1();
        p.m2();    
    }
}