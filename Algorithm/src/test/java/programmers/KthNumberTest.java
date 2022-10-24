package programmers;

import com.likelion.programmers.KthNumber;
import org.junit.jupiter.api.BeforeEach;
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
    KthNumber main;
    private int[] array;
    private int[][] commands;
    private int[] result;

    @BeforeEach
    void setUp() {
        main = new KthNumber();
        this.array = new int[]{1, 5, 2, 6, 3, 7, 4};
        this.commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        this.result = new int[]{5, 6, 3};
    }


    @Test
    @DisplayName("배열을 이용한 풀이")
    void solution() {
        assertEquals(Arrays.toString(main.solution(array, commands)), Arrays.toString(result));
    }

    @Test@DisplayName("우선순위 큐를 이용한 풀이")
    void solutionPQ() {
        assertEquals(Arrays.toString(main.solution(array, commands)), Arrays.toString(result));
    }

}
