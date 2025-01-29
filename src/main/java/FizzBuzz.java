public class FizzBuzz {
    public static String answer(int person) {
        if (person % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(person);
    }
}
