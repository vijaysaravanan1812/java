import java.util.*;// filename: Main.java

class Test {
    static int i;
    int j;
    static {
        i = 10;
        System.out.println("static block called ");
    }
    Test(){
        System.out.println("Constructor called");
    }
}
  
class Main {
    public static void main(String args[]) {
  
       // Although we have two objects, static block is executed only once.
       Test t1 = new Test();
       Test t2 = new Test();
    }
}