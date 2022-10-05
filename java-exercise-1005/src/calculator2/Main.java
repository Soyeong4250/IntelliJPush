package calculator2;

public class Main {

    public static void main(String[] args) {
        NumberGenerator numberGenerator = new SpecificNumberGenerator();
        Calculator randomNumberCalculator = new Calculator(numberGenerator);
        randomNumberCalculator.plus();

        Calculator specificNumberCalculator = new Calculator(new SpecificNumberGenerator());
        specificNumberCalculator.plus();
    }
}
