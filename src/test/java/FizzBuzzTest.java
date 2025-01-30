//import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @ParameterizedTest
    @CsvSource(
            delimiter = '=',
            value = {
                    "1=1",
                    "2=2",
                    "3=Fizz",
                    "4=4",
                    "5=Buzz",
                    "15=FizzBuzz"
            }
    )
    void test_calculate(int person, String expected) {
        String actual = FizzBuzz.calculate(person);
        assertEquals(expected, actual);
    }

/*  @Test
    void int number = 1;
        String actual = FizzBuzz.calculate(number);
        String expected = "1";
        assertEquals(expected, actual);
    }

    @Test
    void expect2_whenGivenNumber2() {
        int number = 2;
        String actual = FizzBuzz.calculate(number);
        String expected = "2";
        assertEquals(expected, actual);
    }

    @Test
    void expectFizz_whenGivenNumber3() {
        int number = 3;
        String actual = FizzBuzz.calculate(number);
        String expected = "Fizz";
        assertEquals(expected, actual);
    }

    @Test
    void expect4_whenGivenNumber4() {
        int number = 4;
        String actual = FizzBuzz.calculate(number);
        String expected = "4";
        assertEquals(expected, actual);
    }

    @Test
    void expectBuzz_whenGivenNumber5() {
        int number = 5;
        String actual = FizzBuzz.calculate(number);
        String expected = "Buzz";
        assertEquals(expected, actual);
    }

    @Test
    void expectFizz_whenGivenNumber6() {
        int number = 6;
        String actual = FizzBuzz.calculate(number);
        String expected = "Fizz";
        assertEquals(expected, actual);
    }

    @Test
    void expectFizzBuzz_whenGivenNumber15() {
        int number = 15;
        String actual = FizzBuzz.calculate(number);
        String expected = "FizzBuzz";
        assertEquals(expected, actual);
    }*/
}
