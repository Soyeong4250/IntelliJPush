package exercise1021;

import com.likelion.programmers.Bracket;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BracketTest {
    Bracket main = new Bracket();

    @Test
    @DisplayName("indexOf & replace")
    void solution() {
        assertTrue(main.solution("(())()"));
        assertFalse(main.solution(")()("));
    }

    @Test
    @DisplayName("indexOf & split & join")
    void solution1() {
        assertTrue(main.solution1("(())()"));
        assertFalse(main.solution1(")()("));
    }

    @Test
    @DisplayName("덧셈 뺄셈 이용")
    void solution2() {
        assertTrue(main.solution2("(())()"));
        assertFalse(main.solution2(")()("));
    }

    @Test
    @DisplayName("Character와 Stack 사용")
    void solution3() {
        assertTrue(main.solution3("(())()"));
        assertFalse(main.solution3(")()("));
    }
}
