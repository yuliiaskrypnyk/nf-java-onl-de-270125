public class IfMethod {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        add(a, b);
        subtract(a, b);

        double a1 = 10.1;
        double b2 = 20.2;
        double resultAddDouble = addDouble(a1, b2);
        System.out.println("AddDouble: " + resultAddDouble);

        int c = -150;
        int resultMakePositive = makePositive(c);
        System.out.println("MakePositive: " + resultMakePositive);


        if (a > b) {
            subtract(a, b);
        } else {
            add(a, b);
        }

        int resultCheckNumber = checkNumber(2);
        System.out.println("CheckNumber: " + resultCheckNumber);

        boolean resultIsPalindrome = isPalindrome("Abba");
        System.out.println("IsPalindrome: " + resultIsPalindrome);
    }

    public static int add(int a, int b) {
        int sum = a + b;
        System.out.println("Add: " + sum);
        return sum;
    }

    public static double addDouble(double a, double b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        int min = a - b;
        System.out.println("Subtract: " + min);
        return min;
    }

    public static int makePositive(int number) {
        return Math.abs(number);
    }

    public static int checkNumber(int number) {
        if (number % 2 == 0) {
            return number;
        } else {
            return number * 2;
        }
    }

    public static boolean isPalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversedStr);
    }
}
