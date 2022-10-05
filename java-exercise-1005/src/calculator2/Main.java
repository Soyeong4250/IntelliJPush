package calculator2;

public class Main {

    public static void main(String[] args) {
        /*
        RandomCalculator를 만들어보세요.
        plus
        min us
        multiple
        divide

        도전과제(업적)
        randomNumber생성하는 로직은 interface를 이용해 di
         */
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        Calculator randomNumberCalculator = new Calculator(numberGenerator);
        randomNumberCalculator.plus(30);
        randomNumberCalculator.minus(30);
        randomNumberCalculator.multiple(30);
        randomNumberCalculator.divide(30);

        Calculator specificNumberCalculator = new Calculator(new SpecificNumberGenerator(), 200);
        specificNumberCalculator.plus(50);  // 250
        specificNumberCalculator.minus(50);  // -150
        specificNumberCalculator.multiple(50);  // 10000
        specificNumberCalculator.divide(50);  // 0.25
    }
}
