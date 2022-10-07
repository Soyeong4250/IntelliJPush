// 2. PopulationMove 구현하기
public class PopulationMove {
    private int fromSido;
    private int toSido;

    // 2-1. Constructor 추가 fromSido, toSido를 받아서 멤버변수 넣는 기능
    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    // 2-2. getter 추가
    public int getFromSido() {
        return fromSido;
    }
    public int getToSido() {
        return toSido;
    }

}
