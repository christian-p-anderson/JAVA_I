package Loops;

//given a number return the factorial of that number

public class Factorial {

    public static void main(String[] args) {
        System.out.println(
                factorial(5)
        );
    }

    private static Integer factorial(Integer number) {
        int factorial = 1;

        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
