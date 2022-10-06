package Set;

public class RandomAlphabetGenerator implements Generator{

    @Override
    public char create() {
        return (char)((int)(Math.random()*26)+65);  // 0~25까지의 랜덤 실수 생성 후 char로 캐스팅
    }

}
