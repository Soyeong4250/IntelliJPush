package programmers;

import com.likelion.programmers.KthNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 프로그래머스 K번째 수 테스트
 * 작성자 : 이소영
 * 최초작성 : 2022.10.24
 */

public class KthNumberTest {

    KthNumber kthNumber = new KthNumber();

    @Test
    @DisplayName("배열을 이용한 풀이")
    void solution() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = {5, 6, 3};
        assertEquals(Arrays.toString(kthNumber.solution(array, commands)), Arrays.toString(result));
    }

}
