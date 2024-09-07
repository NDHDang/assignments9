package calculation3;

public class Calculation3 {

    void sum(int a, int b) {
        System.out.println("int arg method invoked");
    }

    void sum(long a, long b) {
        System.out.println("long arg method invoked");
    }

    public static void main(String[] args) {
        Calculation3 obj = new Calculation3();
        obj.sum(20, 20);
    }

}
