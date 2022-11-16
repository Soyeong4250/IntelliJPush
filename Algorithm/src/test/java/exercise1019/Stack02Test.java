import com.likelion.practice.exerciseOct4.Stack02;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class Stack02Test {
    Stack02 st = new Stack02();

    @BeforeEach
    void setUp() {
        st.push(10);
        st.push(20);
        System.out.println("before each");
    }

    @Test
    @DisplayName("push가 잘 되는지")
    void push() {
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr();
        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    @DisplayName("pop이 잘되는지")
    void pop() {
        assertEquals(20, st.pop());
        assertEquals(10, st.pop());

        // st.pop()이 비어있을땐?
        // Exception의 검증 (모던 Java 표현)
        assertThrows(EmptyStackException.class,() -> {
            st.pop();
        });
    }

    @Test
    @DisplayName("peek 확인")
    void peek() {
        assertEquals(20, st.peek());

        assertThrows(EmptyStackException.class,() -> {
            st.peek();
        });
    }

    @Test
    @DisplayName("isEmpty 확인")
    void isEmpty() {
        assertFalse(st.isEmpty());
        st.pop();
        st.pop();
        assertTrue(st.isEmpty());
    }

    @Test
    void realStack() {
        Stack<Integer> stack = new Stack<>();
        assertThrows(EmptyStackException.class, () -> {
            stack.pop();
            stack.peek();
        });
    }
}
