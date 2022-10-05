package calculator;

public class Calculator {

    private int a;
    private int b;
    public Calculator(){};

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void plus () {
        System.out.println(a + b);
    }

    public void minus () {
        System.out.println(a - b);
    }

    public void multiple () {
        System.out.println(a * b);
    }

    public void divide () {
        System.out.println(a / b);
    }

    public void divide2() {
        System.out.println((float)a/b);
    }
}
