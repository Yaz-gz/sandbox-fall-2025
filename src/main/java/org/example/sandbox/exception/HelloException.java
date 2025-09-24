package org.example.sandbox.exception;

import java.util.Scanner;

public class HelloException {

    public static void main(String[] args) {

        // try-catch
        try {
            // do something
        } catch (Exception e) {
            e.printStackTrace();
        }
        // do something else

        // try-catch-catch - order of catch blocks matters per hierarchy
        try {
            // do something
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception caught");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // do something else

        // try-catch-finally
        try {
            // do something
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // finally do something
            System.out.println("Finally block executed");
        }
        // do something else

        try {
            // do something
        } finally {
            // finally do something
            System.out.println("Finally block executed");
        }
        // do something else

        // java 7 multi-try-catch
        try {
            // do something
        } catch (ArithmeticException | NullPointerException e) {
            e.printStackTrace();
        }
        // do something else

        // try-with-resources
        try (Scanner scanner1 = new Scanner(System.in)) {
            // do something
            System.out.println("Scanner1 is ready to use");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Scanner scanner2 = null;
        try {
            scanner2 = new Scanner(System.in);
            // do something
            System.out.println("Scanner2 is ready to use");
        } finally {
            if (scanner2 != null) {
                scanner2.close();
                System.out.println("Scanner2 closed");
            }
        }
    }
}
