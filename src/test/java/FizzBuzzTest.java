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

    @Test
    void expeect2_whenPerson2() {
        int person = 2;

        String actual = FizzBuzz.answer(person);

        String expected = "2";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expeectFizz_whenPerson3() {
        int person = 3;

        String actual = FizzBuzz.answer(person);

        String expected = "Fizz";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expeect4_whenPerson4() {
        int person = 4;

        String actual = FizzBuzz.answer(person);

        String expected = "4";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expeectBuzz_whenPerson5() {
        int person = 5;

        String actual = FizzBuzz.answer(person);

        String expected = "Buzz";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expeectFizzBuzz_whenPerson15() {
        int person = 15;

        String actual = FizzBuzz.answer(person);

        String expected = "Fizz Buzz";
        Assertions.assertEquals(expected, actual);
    }
}
