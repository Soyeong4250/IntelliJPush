public class RandomCalculatorMain {

    public static void main(String[] args) {
        RandomNumberCreator randomNumberCreator = new RandomNumberCreator();
        RandomCalculator cal = new RandomCalculator(randomNumberCreator);
        cal.plus(10);
        cal.minus(10);
        cal.multiple(20);
        cal.divide(10);
    }

}
