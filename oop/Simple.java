class InnerSimple {
    int a;
    char x;
}

class Annoynmous {
    void print(){
        System.out.println("Inside Annoynmous class");
    }    
}

public class Simple {

    public static void main(String[] args) {
        InnerSimple obj = new InnerSimple();
        obj.a = 10;
        obj.x = 'a';

        System.out.println("Value of a: " + obj.a);
        System.out.println("Value of x: " + obj.x);

        new Annoynmous().print();
    }
}

