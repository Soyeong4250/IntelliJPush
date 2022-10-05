public class CalculatorMain {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.plus(10, 20);  // 30
        cal.minus(20, 10);  // 10
        cal.multiple(10, 20);  // 200
        cal.divide(10, 20);  // 0
        cal.divide2(10, 20);  // 0.5
    }

}
