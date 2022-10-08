import java.util.HashMap;
import java.util.Map;

public class PopulationMoveTrans {

    // 5-2. 시도코드와 시도명 매핑을 위한 변수 생성
    private String toSidoKorean;  // 전입
    private String fromSidoKorean;  // 전출
    private Map<Integer, String> sidoMap = new HashMap<>();

    // 5. 시도코드와 시도명 매핑
    public PopulationMoveTrans(int toSido, int fromSido) {
        this.setSidoMap();
        this.toSidoKorean = this.sidoMap.get(toSido);
        this.fromSidoKorean = this.sidoMap.get(fromSido);
    }

    // 5-1. 시도코드와 시도명 매핑을 위한 메서드 구현
    private void setSidoMap() {
        sidoMap.put(11, "서울특별시");
        sidoMap.put(26, "부산광역시");
        sidoMap.put(27, "대구광역시");
        sidoMap.put(28, "인천광역시");
        sidoMap.put(29, "광주광역시");
        sidoMap.put(30, "대전광역시");
        sidoMap.put(31, "울산광역시");
        sidoMap.put(36, "세종특별자치시");
        sidoMap.put(41, "경기도");
        sidoMap.put(42, "강원도");
        sidoMap.put(43, "충청북도");
        sidoMap.put(45, "충청남도");
        sidoMap.put(46, "전라북도");
        sidoMap.put(47, "전라남도");
        sidoMap.put(48, "경상북도");
        sidoMap.put(49, "경상남도");
        sidoMap.put(50, "제주특별자치도");
    }
}
