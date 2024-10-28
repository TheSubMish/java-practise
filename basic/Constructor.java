class Rectangle {
    private int length;
    private int breath;

    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public int getArea() {
        return length * breath;
    }
}

public class Constructor {
    
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area: " + rectangle.getArea());
    }

}
