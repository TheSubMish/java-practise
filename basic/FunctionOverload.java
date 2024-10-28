public class FunctionOverload {
    public static void main(String[] args) {
        System.out.println(sum(4,5));
        System.out.println(sum(4,5,10));
        System.out.println(sum(4.5,5.5));
        System.out.println(sum(4.5f, 5.5f));
    }

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static float sum(float a, float b) {
        return a + b;
    }

}
