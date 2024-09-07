package caculation1;

public class Calculation1 {

    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculation1 obj = new Calculation1();
        System.out.println(obj.sum(10.5, 10.5));
        System.out.println(obj.sum(20, 20));
    }

}
