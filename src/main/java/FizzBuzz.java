public class FizzBuzz {
    public static String calculate(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return  String.valueOf(number);
    }
}
