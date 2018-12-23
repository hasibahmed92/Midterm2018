package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
        int a = 0;
        int b = 1;

        for (int i = 0; i < 40; i++) {
            System.out.println(a);
            a = a + b;
            b = a - b;

        }

    }
}