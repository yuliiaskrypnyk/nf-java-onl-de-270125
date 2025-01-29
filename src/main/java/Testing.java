public class Testing {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("add " + add(a, b));
        System.out.println("isGerade " + isGerade(a));
        System.out.println("multiply " + multiply(a, b));
        System.out.println("toUpperCase " + toUpperCase("hello"));
        System.out.println("isPositive " + isPositive(a));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isGerade(int number) {
        return number % 2 == 0;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static String toUpperCase(String text) {
        return text.toUpperCase();
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }
}
