package Stack;

import com.likelion.practice.exercise1021.Bracket2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Bracket2Test {
    Bracket2 main = new Bracket2();

    @Test
    @DisplayName("도전과제")
    void solution () {
        assertFalse(main.solution("{}()[](({))"));
        assertTrue(main.solution("{}()[](({}))"));
    }
}
