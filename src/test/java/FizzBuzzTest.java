import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void expeect1_whenPerson1() {
        int person = 1;

        String actual = FizzBuzz.answer(person);

        String expected = "1";
        Assertions.assertEquals(expected, actual);
    }
}
