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

    @Test
    void expect2_whenGivenNumber2() {
        int number = 2;
        String actual = FizzBuzz.calculate(number);
        String expected = "2";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expectFizz_whenGivenNumber() {
        int number = 3;
        String actual = FizzBuzz.calculate(number);
        String expected = "Fizz";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expect4_whenGivenNumber4() {
        int number = 4;
        String actual = FizzBuzz.calculate(number);
        String expected = "4";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expectBuzz_whenGivenNumber5() {
        int number = 5;
        String actual = FizzBuzz.calculate(number);
        String expected = "Buzz";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expectFizz_whenGivenNumber6() {
        int number = 6;
        String actual = FizzBuzz.calculate(number);
        String expected = "Fizz";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expectFizzBuzz_whenGivenNumber15() {
        int number = 15;
        String actual = FizzBuzz.calculate(number);
        String expected = "FizzBuzz";
        Assertions.assertEquals(expected, actual);
    }
}
