public class RandomCalculator {
    private int a;
    private int r;

    public RandomCalculator(int a) {
        this.a = a;
        this.r = (int)(Math.random()*10);
        System.out.println("a는 " + this.a + ", 랜덤 숫자는 " + this.r);
    }

    public void plus () {
        System.out.println(a + r);
    }

    public void minus () {
        System.out.println(a - r);
    }

    public void multiple () {
        System.out.println(a * r);
    }

    public void divide () {
        if(r==0) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        } else {
            System.out.println(a / r);
        }
    }

}
