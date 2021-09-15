
class test{

    int var;
    test(int x)
    {
        this.var = x;
    }
    void show()
    {
        System.out.println("I am show method from test class " +  var + " hi");
    }
}


public class HelloWorld {
     public static void main(String[] args) {
        
        test t  = new test(10);
        t.show();
    }
}