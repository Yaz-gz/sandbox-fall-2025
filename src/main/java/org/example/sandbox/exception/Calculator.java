package org.example.sandbox.exception;

/**
 * A basic calculator class that performs arithmetic operations
 * with proper exception handling.
 */
public class Calculator {

    /**
     * Main method to demonstrate calculator usage
     */
    public static void main(String[] args) throws DivideByZeroException {

        Calculator calc = new Calculator();

        // Basic operations
        System.out.println("Addition: 10 + 5 = " + calc.add(10, 5));
        System.out.println("Addition with varargs: 10 + 5 + 3 + 2 = " + calc.add(10, 5, 3, 2));
        System.out.println("Subtraction: 10 - 5 = " + calc.subtract(10, 5));
        System.out.println("Multiplication: 10 * 5 = " + calc.multiply(10, 5));
        System.out.println("Division: 10 / 5 = " + calc.divide(10, 5));
        System.out.println("Division: 10 / 0 = " + calc.divide(10, 0));

        // Advanced operations
        System.out.println("Power: 2^3 = " + calc.power(2, 3));
        System.out.println("Square root: sqrt(25) = " + calc.sqrt(25));
        System.out.println("Percentage: 20% of 100 = " + calc.percentage(100, 20));

        // Exception handling examples
        System.out.println("\nTesting exception handling:");

        // This will throw ArithmeticException
        calc.divide(10, 0);


        // Test negative square root
        try {
            calc.sqrt(-16);
        } catch (IllegalArgumentException e) {
            System.err.println("Math Error: " + e.getMessage());
        }
    }

    /**
     * Adds two numbers
     *
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double... b) {
        double sum = a;
        for (double num : b) {
            sum += num;
        }
        return sum;
    }

    /**
     * Subtracts second number from first number
     *
     * @param a first number
     * @param b second number
     * @return difference of a and b
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers
     *
     * @param a first number
     * @param b second number
     * @return product of a and b
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides first number by second number
     *
     * @param a dividend
     * @param b divisor
     * @return quotient of a and b
     * @throws ArithmeticException if divisor is zero
     */
    public double divide(double a, double b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("Division by zero is not allowed");
        }
        return a / b;
    }

    public double divide(float a, float b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("Division by zero is not allowed");
        }
        return a / b;
    }

    public double divide(int a, int b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("Division by zero is not allowed");
        }
        return a / b;
    }

    /**
     * Calculates the power of a number
     *
     * @param base     the base number
     * @param exponent the exponent
     * @return base raised to the power of exponent
     */
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    /**
     * Calculates the square root of a number
     *
     * @param number the number to find square root of
     * @return square root of the number
     * @throws IllegalArgumentException if number is negative
     */
    public double sqrt(double number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of negative number");
        }
        return Math.sqrt(number);
    }

    /**
     * Calculates the percentage
     *
     * @param value      the value
     * @param percentage the percentage to calculate
     * @return percentage of the value
     */
    public double percentage(double value, double percentage) {
        return (value * percentage) / 100;
    }
}