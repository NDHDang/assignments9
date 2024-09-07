package calculation2;

public class Calculation2 {

    long sum(int a, long b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculation2 obj = new Calculation2();
        System.out.println(obj.sum(20, 20));
        System.out.println(obj.sum(20, 20, 20));
    }

}
