package calculator2;

// 값을 들어온대로 반환해주는 클래스
public class SpecificNumberGenerator implements NumberGenerator {
    @Override
    public int generate(int num) {
        return num;
    }

}
