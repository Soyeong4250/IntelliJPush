package programmers;

import com.likelion.programmers.TheGreatestNum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheGreatestNumTest {
    TheGreatestNum main;
    private int[] numbers;

    @BeforeEach
    void setUp() {
        main = new TheGreatestNum();
        this.numbers = new int[]{6, 10, 2};
    }

    @Test
    @DisplayName("가장 큰 수 테스트")
    void solution() {
        assertEquals("6210", main.solution(numbers));
    }
}
