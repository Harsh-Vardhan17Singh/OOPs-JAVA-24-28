public class SuperClass {
    int a, b;

    public void get(int x, int y){
        a = x;
        b = y;
    }
}


class Subclass extends SuperClass {
    int a, b;

    public void set(){
        this.a = super.a;  
        this.b = super.b;
    }

    public void put(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

// Demo class with main method
class Demo {
    public static void main(String[] args){
        Subclass obj1 = new Subclass();
        obj1.get(10, 20);  
        obj1.set();        
        obj1.put();        
    }
}
