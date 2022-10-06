package Set;

public class RandomAlphabetGenerator implements Generator{
    @Override
    public Character create(int num) {
        int rndNum = (int)(Math.random()*26);

        return (char)(rndNum + 65);  // 0~25까지의 랜덤 실수 생성 후 char로 캐스팅
    }

}
