public class FizzBuzz {
    public static String answer(int person) {
        if (person % 15 == 0) {
            return "Fizz Buzz";
        }

        if (person % 3 == 0) {
            return "Fizz";
        }

        if (person % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(person);
    }
}
