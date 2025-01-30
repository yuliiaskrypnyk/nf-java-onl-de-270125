import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void expect1_whenGivenNumber1() {
        // Given
        int number = 1;
        // When
        String actual = FizzBuzz.calculate(number);
        // Then
        String expected = "1";

        Assertions.assertEquals(expected, actual);
    }

}
