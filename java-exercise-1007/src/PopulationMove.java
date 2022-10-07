// 2. PopulationMove 구현하기
public class PopulationMove {
    private int toSido;  // 전입
    private int fromSido;  // 전출

    // 2-1. Constructor 추가 fromSido, toSido를 받아서 멤버변수 넣는 기능
    public PopulationMove(int toSido, int fromSido) {
        this.toSido = toSido;
        this.fromSido = fromSido;
    }

    public PopulationMove(String toSido, String fromSido) {
        this.toSido = Integer.parseInt(toSido);
        this.fromSido = Integer.parseInt(fromSido);
    }
    // 2-2. getter 추가
    public int getToSido() {
        return toSido;
    }
    public int getFromSido() {
        return fromSido;
    }

}
