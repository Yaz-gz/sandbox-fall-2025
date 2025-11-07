package org.example.sandbox.bigo;

public class Test {

    public static void main(String[] args) {

        for(int n = 1000; n <= 100000; n += 1000) {
            long startTime = System.nanoTime();

            long sum = 0;
            for(int i = 0; i < n; i++) {
                sum = sum + i;
            }

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("n: " + n + ", Time taken (ns): " + duration);
        }
    }
}
