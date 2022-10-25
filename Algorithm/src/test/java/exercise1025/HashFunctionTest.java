package exercise1025;

import com.likelion.practice.exercise1025.HashFunction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashFunctionTest {
    HashFunction hashFunction;

    @BeforeEach
    void setUp() {
        hashFunction = new HashFunction();


    }

    @Test
    @DisplayName("Hash 구현 테스트")
    void solution() {
        assertEquals(53, hashFunction.hash("Kyeongrok"));
    }
}
