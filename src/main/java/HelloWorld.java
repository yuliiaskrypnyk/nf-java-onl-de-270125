public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        System.out.println("Java is cool!");

        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum);

        System.out.println("\nint Step 1:");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        System.out.println("\nint Step 2:");
        System.out.println("a > b " + (a > b));
        System.out.println("a < b " + (a < b));
        System.out.println("a == b " + (a == b));

        System.out.println("\nfloat Step 1:");
        float c = 10.1f;
        float d = 20.2f;
        System.out.println("+ " + (c + d));
        System.out.println("- " + (c - d));
        System.out.println("* " + (c * d));
        System.out.println("/ " + (c / d));

        System.out.println("\nfloat Step 2:");
        System.out.println("c > d " + (c > d));
        System.out.println("c < d " + (c < d));
        System.out.println("c == d " + (c == d));

        System.out.println("\ndouble Step 1:");
        double e = 10.1;
        double f = 20.2;
        System.out.println("+ " + (e + f));
        System.out.println("- " + (e - f));
        System.out.println("* " + (e * f));
        System.out.println("/ " + (e / f));

        System.out.println("\ndouble Step 2:");
        System.out.println("e > f " + (e > f));
        System.out.println("e < f " + (e < f));
        System.out.println("e == f " + (e == f));
    }
}
