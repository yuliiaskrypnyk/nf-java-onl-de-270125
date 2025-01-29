import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //erstes Array
        System.out.println("Erstes Array: ");
        int[] numbers1 = new int[10];
        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = i + 1;
        }

        int sum = 0;
        for (int number : numbers1) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println("\nSumme: " + sum);

        int max = Arrays.stream(numbers1).max().getAsInt();
        System.out.println("Max number: " + max);

        //zweites Array
        System.out.println("Zweites Array: ");
        int[] numbers2 = new int[10];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = i + 11;
        }

        for (int number : numbers2) {
            System.out.print(number + " ");
        }

        int[] result = new int[10];

        for (int i = 0; i < numbers1.length; i++) {
            result[i] = numbers1[i] + numbers2[i];
        }

        System.out.println("\nSum result: ");
        for (int res : result) {
           System.out.print(res + " ");
        }
    }
}
