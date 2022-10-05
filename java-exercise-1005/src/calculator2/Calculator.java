package calculator2;

public class Calculator {
    // NumberGenerator에서 만들어준 숫자를 가지고
    // 사칙 연산한 결과를 출력

    private NumberGenerator numberGenerator;
    private int baseNum = 10;

    public Calculator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    // Constructor Overloading
    public Calculator(NumberGenerator numberGenerator, int baseNum) {
        this.numberGenerator = numberGenerator;
        this.baseNum = baseNum;
    }

    public void plus(int num) {
        System.out.println(num + this.numberGenerator.generate(this.baseNum));
    }

    public void minus(int num) {
        System.out.println(num - this.numberGenerator.generate(this.baseNum));
    }

    public void multiple(int num) {
        System.out.println(num * this.numberGenerator.generate(this.baseNum));
    }

    public void divide(int num) {
        try {
            float result = (float)num / this.numberGenerator.generate(this.baseNum);
            System.out.println(result);
        } catch(ArithmeticException e) {
            e.printStackTrace();
            System.out.println("0으로는 나눌 수 없습니다.");
        }
    }
}
