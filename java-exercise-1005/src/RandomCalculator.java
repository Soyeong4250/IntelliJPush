public class RandomCalculator {
    private int r;
    private NumberCreator random;

    public RandomCalculator(NumberCreator random) {
        this.r = random.randomNumberCreator();
    }

    public void plus (int a) {
        System.out.println(a + r);
    }

    public void minus (int a) {
        System.out.println(a - r);
    }

    public void multiple (int a) {
        System.out.println(a * r);
    }

    /*public void divide () {
        if(r==0) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        } else {
            System.out.println(a / r);
        }
    }
    */

    // 에러 처리
    public void divide(int a) {
        try {
            float result = (float) a / r;
            System.out.println(result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("램덤으로 생성한 숫자가 0입니다.");
        }

    }

}
